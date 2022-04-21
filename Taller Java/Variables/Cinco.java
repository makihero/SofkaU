import java.util.Scanner;

public class Cinco {

	public static void main(String[] args) {
		String nombreMascota, tipo, nombreDueno;
		int    edad;
		
		Scanner input = new Scanner(System.in);
		System.out.println("¿Cuál es el nombre de su mascota?");
		nombreMascota = input.next();
		System.out.println("¿Que raza de mascota es?");
		tipo = input.next();
		System.out.println("¿Qué edad tiene su mascota?");
		edad = input.nextInt();
		System.out.println("¿Nombre completo del dueño de la mascota?");
		nombreDueno = input.next();
		
		System.out.println();
		System.out.println(nombreMascota+ " es un(a) "+ tipo+ " el cual tiene "+ edad+ " años de edad y "+ nombreDueno+ " es actualmente su dueño");

	}

}
