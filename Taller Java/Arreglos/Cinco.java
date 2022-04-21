import java.util.Scanner;

public class Cinco {

	public static void main(String[] args) {
		int tabla[][] = new int[11][11];
		
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				tabla[i][j] = i*j;
			}
		}
		for (int i = 1; i < tabla.length; i++) {
			for (int j = 1; j < tabla.length; j++) {
				System.out.print(j+" x "+i+"|");
			}
			System.out.println();
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese fila: ");
		int f = sc.nextInt();
		System.out.println("Ingrese Columna: ");
		int c = sc.nextInt();
		
		
		System.out.println("Resultado: "+ tabla[f][c]);
	}

}
