import java.util.Scanner;

public class Cuatro {

	public static void main(String[] args) {
		String ciudad, pais;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Escribe el nombre de un pa�s");
		pais = input.next();
		System.out.println("�Cu�l es su capital?");
		ciudad = input.next();
		
		System.out.println();
		System.out.println("La ciudad "+ ciudad+ " es la capital del pa�s "+ pais);

	}

}
