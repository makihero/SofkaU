import java.util.Scanner;

public class Dos {

	public static void main(String[] args) {
		int edad;
		
		Scanner input = new Scanner(System.in);
		System.out.println("�Cu�l es su edad?");
		edad = input.nextInt();
		
		if (edad < 18) {
			System.out.println("Usted a�n es un ni�o(a)");
		}

	}

}
