import java.util.Scanner;

public class Nueve {

	public static void main(String[] args) {
		int    op;
		double base, base1, altura, areaRectangulo, areaTriangulo, areaTrapecio;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Elija una opci�n: ");
		System.out.println("1. Calcular area rect�ngulo");
		System.out.println("2. Calcular area tri�ngulo");
		System.out.println("3. Calcular area trapecio");
		System.out.println("4. Salir");
		op = input.nextInt();
		
		switch (op) {
		case 1:
			System.out.println("Escriba la base del rect�ngulo: ");
			base = input.nextDouble();
			System.out.println("Escriba la altura del rect�ngulo: ");
			altura = input.nextDouble();
			areaRectangulo = (base * altura);
			System.out.println("El area del Rect�ngulo es: "+ areaRectangulo);
			break;
		case 2:
			System.out.println("Escriba la base del tri�ngulo: ");
			base = input.nextDouble();
			System.out.println("Escriba la altura del tri�ngulo: ");
			altura = input.nextDouble();
			areaTriangulo = (base * altura) / 2;
			System.out.println("El area del tri�ngulo es: "+ areaTriangulo);
			break;
		case 3:
			System.out.println("Escriba la base menor del trapecio: ");
			base = input.nextDouble();
			System.out.println("Escriba la base mayor del trapecio: ");
			base1 = input.nextDouble();
			System.out.println("Escriba la altura del trapecio: ");
			altura = input.nextDouble();
			areaTrapecio = ((base + base1)/2) * altura;
			System.out.println("El area del trapecio es: "+ areaTrapecio);
			break;
		case 4:
			System.out.println("!Hasta Luego�");
			break;

		}
		
		
		
	}

}
