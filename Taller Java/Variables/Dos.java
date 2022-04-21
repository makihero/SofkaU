import java.util.Scanner;

public class Dos {

	public static void main(String[] args) {
		String nombre, apellido;
		int    edad;
		double estatura;
		
		Scanner input = new Scanner(System.in);
		System.out.println("¿Cuál es su nombre?");
		nombre = input.next();
		System.out.println("¿Cuál es su apellido?");
		apellido = input.next();
		System.out.println("¿Qué edad tienes?");
		edad = input.nextInt();
		System.out.println("¿Cuál es su estatura?");
		estatura = input.nextDouble();
		
		System.out.println();
		System.out.println("Mi nombre completo es "+nombre+" "+apellido+"\n"+
							"Tengo "+edad+" años de edad"+"\n"+
							"Mido "+estatura+" metros de estatura");

	}

}
