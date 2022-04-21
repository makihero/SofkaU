import java.util.Scanner;

public class Tres {

	public static void main(String[] args) {
		String nombre, nombrePadre, apellidoPadre, nombreMadre, apellidoMadre;
		
		Scanner input = new Scanner(System.in);
		System.out.println("¿Cuál es su nombre?");
		nombre = input.next();
		System.out.println("¿Nombre de su padre?");
		nombrePadre = input.next();
		System.out.println("¿Apellido de su padre?");
		apellidoPadre = input.next();
		System.out.println("¿Nombre de su madre?");
		nombreMadre = input.next();
		System.out.println("¿Apellido de su madre?");
		apellidoMadre = input.next();
		
		System.out.println();
		System.out.println("Yo "+ nombre+ " "+ apellidoPadre+ " "+ apellidoMadre+ " soy hijo de "+ nombreMadre+ " "+ apellidoMadre+ " y "+ nombrePadre+ " "+ apellidoPadre);

	}

}
