import java.util.Scanner;

public class Seis {

	public static void main(String[] args) {
		String observacion, repuesto, repuestos;
		int    op;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Elija una opción: ");
		System.out.println("1. Ingresar motocicleta");
		System.out.println("2. Arreglos mecánico");
		System.out.println("3. Salir");
		op = input.nextInt();
		
		switch (op) {
		case 1:
			System.out.println("Para ingresar, Por favor digite la falla");
			observacion = input.next();
			System.out.println("Registro exitoso de las falla...");
			break;
			
		case 2:
			System.out.println("Por favor, ingrese observaciones");
			observacion = input.next();
			System.out.println("Usó algun repuesto para la reparación(si/no)");
			repuesto = input.next();
			if (repuesto.equals("si")) {
				System.out.println("Escriba los repuestos que usó");
				repuestos = input.next();
				System.out.println("Para la falla: "+ "["+observacion+"]"+ " se usó los repuestos: "+ repuestos);
			}
			break;
		case 3:
			System.out.println("!Hasta Luego¡");

		}

	}

}
