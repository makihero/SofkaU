import java.util.Scanner;

public class Cuatro {

	public static void main(String[] args) {
		String anotaciones;
		int    op, op1;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Elija una opción: ");
		System.out.println("1. Alquilar película");
		System.out.println("2. Consultar películas");
		System.out.println("3. Recibir película");
		System.out.println("4. Salir");
		op = input.nextInt();
		
		switch (op) {
		case 1:
			System.out.println(" .:Elije la película:. ");
			System.out.println("1. El Aro");
			System.out.println("2. Los Vengadores");
			System.out.println("3. Harry Potter");
			System.out.println("4. Dragon Ball Z");
			System.out.println("5. Camino Hacia el Terror");
			op1 = input.nextInt();
			
			if (op1 == 1) {
				System.out.println("Alquilaste El Aro");
			}else if (op1 == 2) {
				 System.out.println("Alquilaste Los Vengadores");
			}else if (op1 == 3) {
				System.out.println("Alquilaste Harry Potter");
			}else if (op1 == 4) {
				 System.out.println("Alquilaste Dragon Ball Z");
			}else if (op1 == 5) {
				System.out.println("Alquilaste Camino Hacia el Terror");
			}
			break;
		case 2:
			System.out.println(" .:Películas Disponibles:. ");
			System.out.println("El Aro");
			System.out.println("Los Vengadores");
			System.out.println("Harry Potter");
			System.out.println("Dragon Ball Z");
			System.out.println("Camino Hacia el Terror");
			break;
	
		case 3:
			System.out.println("Anotaciones o novedades sobre la película");
			anotaciones = input.next();
			System.out.println("novedades guardadas...");
			break;
		case 4:
			System.out.println("Hasta luego, gracias por visitarnos");
		}

	}

}
