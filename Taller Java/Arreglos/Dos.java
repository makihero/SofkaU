import java.util.Random;

public class Dos {

	public static void main(String[] args) {
		int arreglo[] = new int[20];
		Random rnd = new Random();
		
		for (int i = 1; i < arreglo.length; i++) {
			arreglo[i] = (rnd.nextInt(100));
		}
		
		System.out.print("Números pares: ");
		for (int j = 1; j < arreglo.length; j++) {
			if (arreglo[j] % 2 == 0) {
				System.out.print(arreglo[j]+", ");
			}	
		}
		System.out.println();
		System.out.print("Números impares: ");
		for (int j = 1; j < arreglo.length; j++) {
			if (arreglo[j] % 2 != 0) {
				System.out.print(arreglo[j]+", ");
			}	
		}
		

	}

}
