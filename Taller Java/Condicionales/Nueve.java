import java.util.Scanner;

public class Nueve {

	public static void main(String[] args) {
		int    op;
		double base, base1, altura, areaRectangulo, areaTriangulo, areaTrapecio;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Elija una opción: ");
		System.out.println("1. Calcular area rectángulo");
		System.out.println("2. Calcular area triángulo");
		System.out.println("3. Calcular area trapecio");
		System.out.println("4. Salir");
		op = input.nextInt();
		
		switch (op) {
		case 1:
			System.out.println("Escriba la base del rectángulo: ");
			base = input.nextDouble();
			System.out.println("Escriba la altura del rectángulo: ");
			altura = input.nextDouble();
			areaRectangulo = (base * altura);
			System.out.println("El area del Rectángulo es: "+ areaRectangulo);
			break;
		case 2:
			System.out.println("Escriba la base del triángulo: ");
			base = input.nextDouble();
			System.out.println("Escriba la altura del triángulo: ");
			altura = input.nextDouble();
			areaTriangulo = (base * altura) / 2;
			System.out.println("El area del triángulo es: "+ areaTriangulo);
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
			System.out.println("!Hasta Luego¡");
			break;

		}
		
		
		
	}

}
