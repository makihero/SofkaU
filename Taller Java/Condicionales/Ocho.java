import java.util.Scanner;

public class Ocho {

	public static void main(String[] args) {
		int op, op1, t1, t2, t3, t4, t5, compra;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Elija una opción: ");
		System.out.println("1. Tortas disponibles");
		System.out.println("2. Salir");
		op = input.nextInt();
		
		t1=10;t2=8;t3=10;t4=10;t5=12;
		
		switch (op) {
		case 1:
			System.out.println("Elegir torta");
			System.out.println("1.Torta mousse de chocolate y baileys "+ t1+ " Und. disponibles");
			System.out.println("2.Torta de fresas con crema de vainilla "+ t2+ " Und. disponibles");
			System.out.println("3.Torta Cheesecake de Nutella "+ t3+ " Und. disponibles");
			System.out.println("4.Torta fácil de hojaldre con fresas y almendra "+ t4+ " Und. disponibles");
			System.out.println("5.Torta ganache de chocolate y banano "+ t5+ " Und. disponibles");
			op1 = input.nextInt();
			
			System.out.println("¿Cuántas tortas desea?");
			compra = input.nextInt();
			if (op1 == 1) {
				t1 = t1 - compra;
				System.out.println("Se vende "+ compra+ " Torta mousse "+ t1+ " Und. disponibles");
			}
			if (op1 == 2) {
				t2 = t2 - compra;
				System.out.println("Se vende "+ compra+ " Torta mousse "+ t2+ " Und. disponibles");
			}
			if (op1 == 3) {
				t3 = t3 - compra;
				System.out.println("Se vende "+ compra+ " Torta mousse "+ t3+ " Und. disponibles");
			}
			if (op1 == 4) {
				t4 = t4 - compra;
				System.out.println("Se vende "+ compra+ " Torta mousse "+ t4+ " Und. disponibles");
			}
			if (op1 == 5) {
				t5 = t5 - compra;
				System.out.println("Se vende "+ compra+ " Torta mousse "+ t5+ " Und. disponibles");
			}
			break;

		case 2:
			System.out.println("!Hasta Luego¡");
		}
		
		
		

	}

}
