import java.util.Scanner;

public class Dos {

	public static void main(String[] args) {
		int edad;
		
		Scanner input = new Scanner(System.in);
		System.out.println("¿Cuál es su edad?");
		edad = input.nextInt();
		
		if (edad < 18) {
			System.out.println("Usted aún es un niño(a)");
		}

	}

}
