import java.util.Scanner;

public class Tres {
	
	public static void main(String[] args) {
		String nombre, apellido;
		int    edad;
		
		Scanner input = new Scanner(System.in);
		System.out.println("�Cu�l es su nombre?");
		nombre = input.next();
		System.out.println("�Cu�l es su apellido?");
		apellido = input.next();
		System.out.println("�Cu�l es su edad?");
		edad = input.nextInt();
		
		if (edad >= 18) {
			System.out.println(nombre+ " "+ apellido+ " usted es mayor de edad, por lo tanto puede entrar a la fiesta");
						
		}else {
			System.out.println(nombre+ " "+ apellido+ " usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devu�lvase a su casa");
		}
		
		
	}
}
