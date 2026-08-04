public class ArrayListTrucho {
	
	private int contador = 0;
	private int[] guardado = new int[contador];
	
	private int limiteActual = guardado.length;
	
	
	
	public ArrayListTrucho() {
	}
	public void agregar(int datoNuevo) {
		int j = 0;
		int[] vectorDinamico = new int[limiteActual+1];
		
		for(int i = 0; i < guardado.length; i++) {
			
			vectorDinamico[i] = guardado[j];
			j++;
		}
		
		vectorDinamico[limiteActual] = datoNuevo;
		
		guardado = vectorDinamico;
		limiteActual = guardado.length;
	}
	
	public void sacar(int indiceEleccionQuitado) {
		
		
		int auxiliar = 0;
		int j = 0;
		int[] vectorDinamico = new int[limiteActual-1];
		
		for(int i = 0; i < limiteActual-1 ; i++) {
			if(i != indiceEleccionQuitado) {
				auxiliar = guardado[i];
				vectorDinamico[j] = auxiliar;
				j++;
			}
		
		
		
		}
		guardado = vectorDinamico;
		}
		
	
	//Funcion Inedita
	
	public int sacarPromedio() {
		
		int sumatoriaTotal = 0;
		int promedio;
		for(int elementoActual : guardado) {
			sumatoriaTotal += elementoActual;
		}
		
		promedio = sumatoriaTotal/limiteActual;
		
		return promedio;
	}
	public int longitud() {
		return guardado.length;
	}
	public int[] getGuardado() {
		return guardado;
	}
	
}
