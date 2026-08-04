package pruebas;

public class pruebita {
	public static void main(String[] args) {
		int[][][] m1 = new int[2][2][2];
		
		for(int i = 0; i<2;i++) {
			for(int j = 0; j< 2;j++) {
				for(int k = 0; k<2;k++) {
					m1[i][j][k] = 2;
				}
			}
		}
		System.out.println(java.util.Arrays.deepToString(m1));
		int[][] m2 = new int[3][4];
		
		System.out.println(m2.length);
		System.out.println(m2.clone());
		
	}
}
