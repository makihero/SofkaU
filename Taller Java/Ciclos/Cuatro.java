import java.util.Scanner;

public class Cuatro {

	public static void main(String[] args) {
		int numeroUsuario;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el número a multiplicar: ");
		numeroUsuario = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(i+" x "+numeroUsuario+" = "+i*numeroUsuario);
		}

	}

}
