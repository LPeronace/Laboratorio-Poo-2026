package modelo;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import interfaz.PanelBorrarAlumnos;
import interfaz.PanelCargarAlumnos;
import interfaz.PanelPrincipal;
//marco.setContentPane(panel); para cambiar el panel actual
public class App {
	private static PanelCargarAlumnos cargar = new PanelCargarAlumnos();
	private static PanelBorrarAlumnos borrar = new PanelBorrarAlumnos();
	private static PanelPrincipal principal = new PanelPrincipal();
	
	public static void main(String[] args) {
		JFrame marco = new JFrame();
		
		marco.setBounds(100, 100, 800, 500);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.validate();
		marco.setVisible(true);
		
		marco.setContentPane(cargar);

	
		
		//marco.setContentPane(cargar);
		
		
	}
	
}
