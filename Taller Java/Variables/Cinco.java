import java.util.Scanner;

public class Cinco {

	public static void main(String[] args) {
		String nombreMascota, tipo, nombreDueno;
		int    edad;
		
		Scanner input = new Scanner(System.in);
		System.out.println("�Cu�l es el nombre de su mascota?");
		nombreMascota = input.next();
		System.out.println("�Que raza de mascota es?");
		tipo = input.next();
		System.out.println("�Qu� edad tiene su mascota?");
		edad = input.nextInt();
		System.out.println("�Nombre completo del due�o de la mascota?");
		nombreDueno = input.next();
		
		System.out.println();
		System.out.println(nombreMascota+ " es un(a) "+ tipo+ " el cual tiene "+ edad+ " a�os de edad y "+ nombreDueno+ " es actualmente su due�o");

	}

}
