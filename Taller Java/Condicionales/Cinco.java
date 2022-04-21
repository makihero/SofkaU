import java.util.Scanner;

public class Cinco {

	public static void main(String[] args) {
		int    op, op1, op2;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Elija una opción: ");
		System.out.println("1. Medicamentos disponibles");
		System.out.println("2. Precios de medicamentos");
		System.out.println("3. Devolución de medicamentos");
		System.out.println("4. Salir");
		op = input.nextInt();
		
		switch (op) {
		case 1:
			System.out.println("         .:Elija su medicamento:. ");
			System.out.println("1. Simvastatina - para controlar el colesterol");
			System.out.println("2. Omeprazol - para la acidez de estómago");
			System.out.println("3. Ramipril - para la hipertensión");
			System.out.println("4. Paracetamol - para aliviar el dolor");
			System.out.println("5. Salbutamol - para el asma");
			op1 = input.nextInt();
			
			if (op1 == 1) {
				System.out.println("Compraste Simvastatina");
			}else if (op1 == 2) {
				 System.out.println("Compraste Omeprazol");
			}else if (op1 == 3) {
				System.out.println("Compraste Ramipril");
			}else if (op1 == 4) {
				 System.out.println("Compraste Paracetamol");
			}else if (op1 == 5) {
				System.out.println("Compraste Salbutamol");
			}
			break;

		case 2:
			System.out.println("   Producto  "+ "  Precio   ");
			System.out.println("Simvastatina "+ "  $5.000   ");
			System.out.println("Omeprazol"+ "      $12.000   ");
			System.out.println("Ramipril"+ "       $10.000   ");
			System.out.println("Paracetamol"+ "    $15.000   ");
			System.out.println("Salbutamol"+ "     $11.000   ");
			break;
			
		case 3:
			System.out.println(".:Elija medicamento a devolver:. ");
			System.out.println("1. Simvastatina");
			System.out.println("2. Omeprazol");
			System.out.println("3. Ramipril");
			System.out.println("4. Paracetamol");
			System.out.println("5. Salbutamol");
			op2 = input.nextInt();
			
			if (op2 == 1) {
				System.out.println("Devolviste Simvastatina");
			}else if (op2 == 2) {
				 System.out.println("Devolviste Omeprazol");
			}else if (op2 == 3) {
				System.out.println("Devolviste Ramipril");
			}else if (op2 == 4) {
				 System.out.println("Devolviste Paracetamol");
			}else if (op2 == 5) {
				System.out.println("Devolviste Salbutamol");
			}
			break;
		
		case 4:
			System.out.println("!Hasta Luego¡");
			
		}

	}

}
