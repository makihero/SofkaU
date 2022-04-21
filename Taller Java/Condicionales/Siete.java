import java.util.Scanner;

public class Siete {

	public static void main(String[] args) {
		double peso, estatura, imc;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese su peso en kilogramos");
		peso = input.nextDouble();
		System.out.println("Ingrese su estatura en metros");
		estatura = input.nextDouble();
		
		imc = peso / Math.pow(estatura, 2);
		
		System.out.println("Su índice de masa corporal es: "+ imc);
		if (imc < 18.5) {
			System.out.println("Está bajo de peso");
		}
		if (imc > 18.5 & imc < 24.9) {
			System.out.println("Tiene un peso Normal");
		}
		if (imc > 25 & imc < 29.9) {
			System.out.println("Tiene sobrepeso");
		}
		if (imc > 30) {
			System.out.println("Tiene obesidad");
		}

	}

}
