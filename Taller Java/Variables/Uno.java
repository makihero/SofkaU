import java.util.Scanner;

public class Uno {

	public static void main(String[] args) {
		String nombre, apellido;
		
		Scanner input = new Scanner(System.in);
		System.out.println("¿Cuál es su nombre?");
		nombre = input.next();
		System.out.println("¿Cuál es su apellido?");
		apellido = input.next();
		
		System.out.println("Mi nombre es: "+nombre+" "+apellido);
		

	}

}
