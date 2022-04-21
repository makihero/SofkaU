
public class Cuatro {

	public static void main(String[] args) {
		int matriz[][] = new int[4][5];
		int matriz1[][] = new int[4][5];
		int contador = 0;
		
		matriz[0][0] = 01;
		matriz[0][1] = 02;
		matriz[0][2] = 03;
		matriz[0][3] = 04;
		matriz[0][4] = 05;
		matriz[1][0] = 10;
		matriz[1][1] = 9;
		matriz[1][2] = 8;
		matriz[1][3] = 07;
		matriz[1][4] = 06;
		matriz[2][0] = 11;
		matriz[2][1] = 12;
		matriz[2][2] = 13;
		matriz[2][3] = 14;
		matriz[2][4] = 15;
		matriz[3][0] = 20;
		matriz[3][1] = 19;
		matriz[3][2] = 18;
		matriz[3][3] = 17;
		matriz[3][4] = 16;
		
		for (int f = 0; f < matriz1.length; f++) {
			for (int c = 0; c < matriz1.length+1; c++) {
				contador++;
				matriz1[f][c] = contador;
			}
		}
		for (int f = 0; f < matriz1.length; f++) {
			for (int c = 0; c < matriz1.length+1; c++) {
				System.out.print(matriz1[f][c]+" ");
			}
			System.out.println();
		}
		
		System.out.println("-------------");
		for (int f = 0; f < matriz.length; f++) {
			for (int c = 0; c < matriz.length+1; c++) {
				System.out.print(matriz[f][c]+ " ");
			}
			System.out.println();
		}
		
		

	}

}
