import java.util.Scanner;

public class Cinco {

	public static void main(String[] args) {
		int    op;
		String nombre;
		op = 0;
		nombre = "";
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Menu de Usuario");
			System.out.println("1. Capturar nombre");
			System.out.println("2. Saludar persona");
			System.out.println("3. Salir");
			op = sc.nextInt();
			
			switch (op) {
			case 1:
				System.out.println("Por favor, escriba su nombre");
				nombre = sc.next();
				break;
			case 2:
				System.out.println("Hola, "+nombre+" Como estás");
				break;
			case 3:
				System.out.println("   !Hasta luego¡");
				System.out.println("Programa finalizado");
				break;
			}
		} while (op != 3);
		
		

	}

}
