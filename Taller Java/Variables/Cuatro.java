import java.util.Scanner;

public class Cuatro {

	public static void main(String[] args) {
		String ciudad, pais;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Escribe el nombre de un país");
		pais = input.next();
		System.out.println("¿Cuál es su capital?");
		ciudad = input.next();
		
		System.out.println();
		System.out.println("La ciudad "+ ciudad+ " es la capital del país "+ pais);

	}

}
