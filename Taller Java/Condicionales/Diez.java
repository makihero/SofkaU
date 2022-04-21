import java.util.Scanner;

public class Diez {

	public static void main(String[] args) {
		int    op;
		double saldo, ingreso, retiro;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Por favor, ingresar saldo");
		saldo = input.nextDouble();
		
		System.out.println("Elija una opción: ");
		System.out.println("1. Ingresar dinero a su cuenta");
		System.out.println("2. Retirar dinero de su cuenta");
		System.out.println("3. Consultar saldo");
		System.out.println("4. Salir");
		op = input.nextInt();
		
		
		switch (op) {
		case 1:
			System.out.println("Digite cantidad a ingresar: ");
			ingreso = input.nextDouble();
			if (ingreso >= 0) {
				saldo = saldo + ingreso;
			}else {
				System.out.println("Saldo incorrecto, digite un valor válido");
			}
			System.out.println("Saldo actual: $"+ saldo);			
			break;
		
		case 2:
			System.out.println("Digite cantidad a retirar: ");
			retiro = input.nextDouble();
			if (retiro <= saldo & retiro > 0) {
				saldo = saldo - retiro;
			}else{
				System.out.println("Saldo insuficiente, vuelva a intentarlo");
			}
			break;
		
		case 3:
			System.out.println("Saldo actual: $"+ saldo);
			break;
			
		case 4:
			System.out.println("!Hasta Luego¡");
						
		}		
		
	}

}
