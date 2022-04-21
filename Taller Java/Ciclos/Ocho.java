import java.util.Scanner;

public class Ocho {

	public static void main(String[] args) {
		String p1,p2,p3,p4,p5,p6,p7,p8;
		String n1,n2,n3,n4,n5,n6,n7,n8;
		String r1,r2,r3,r4,r5,r6,r7,r8;
		int    op1,op2,i;
		
		op1=0;op2=0;
		p1="";p2="";p3="";p4="";p5="";p6="";p7="";p8="";
		n1="";n2="";n3="";n4="";n5="";n6="";n7="";n8="";
		r1="";r2="";r3="";r4="";r5="";r6="";r7="";r8="";
		
		while (op1 != 3) {
			Scanner sc = new Scanner(System.in);
			 System.out.println("      .:MENU USUARIO:. ");
			 System.out.println("1. Ingresar aprendiz");
			 System.out.println("2. Consulta de usuarios que presentaron prueba");
			 System.out.println("3. Salir");
			 op1 = sc.nextInt();
			 
			 if (op1 == 1) {
				System.out.println("Hay ocho cupos, elige uno: ");
				System.out.println("    [1,2,3,4,5,6,7,8]");
				op2 = sc.nextInt();
			
			switch (op2) {
			case 1:
				System.out.println("Escriba nombre del aprendiz");
				n1 = sc.next();
				System.out.println("¿Presentaste la prueba? (si o no)");
				p1 = sc.next();
				if (p1.equals("si")) {
					System.out.println("por favor escriba el resultado: (aprobo o reprobo)");
					r1 = sc.next();
				}
				break;
			case 2:
				System.out.println("Escriba nombre del aprendiz");
				n2 = sc.next();
				System.out.println("¿Presentaste la prueba? (si o no)");
				p2 = sc.next();
				if (p2.equals("si")) {
					System.out.println("por favor escriba el resultado: (aprobo o reprobo)");
					r2 = sc.next();
				}
				break;	
			case 3:
				System.out.println("Escriba nombre del aprendiz");
				n3 = sc.next();
				System.out.println("¿Presentaste la prueba? (si o no)");
				p3 = sc.next();
				if (p3.equals("si")) {
					System.out.println("por favor escriba el resultado: (aprobo o reprobo)");
					r3 = sc.next();
				}
				break;	
			case 4:
				System.out.println("Escriba nombre del aprendiz");
				n4 = sc.next();
				System.out.println("¿Presentaste la prueba? (si o no)");
				p4 = sc.next();
				if (p4.equals("si")) {
					System.out.println("por favor escriba el resultado: (aprobo o reprobo)");
					r4 = sc.next();
				}
				break;	
			case 5:
				System.out.println("Escriba nombre del aprendiz");
				n5 = sc.next();
				System.out.println("¿Presentaste la prueba? (si o no)");
				p5 = sc.next();
				if (p5.equals("si")) {
					System.out.println("por favor escriba el resultado: (aprobo o reprobo)");
					r5 = sc.next();
				}
				break;	
			case 6:
				System.out.println("Escriba nombre del aprendiz");
				n6 = sc.next();
				System.out.println("¿Presentaste la prueba? (si o no)");
				p6 = sc.next();
				if (p6.equals("si")) {
					System.out.println("por favor escriba el resultado: (aprobo o reprobo)");
					r6 = sc.next();
				}
				break;
			case 7:
				System.out.println("Escriba nombre del aprendiz");
				n7 = sc.next();
				System.out.println("¿Presentaste la prueba? (si o no)");
				p7 = sc.next();
				if (p7.equals("si")) {
					System.out.println("por favor escriba el resultado: (aprobo o reprobo)");
					r7 = sc.next();
				}
				break;
			case 8:
				System.out.println("Escriba nombre del aprendiz");
				n8 = sc.next();
				System.out.println("¿Presentaste la prueba? (si o no)");
				p8 = sc.next();
				if (p8.equals("si")) {
					System.out.println("por favor escriba el resultado: (aprobo o reprobo)");
					r8 = sc.next();
				}
				break;	
			default:
				System.out.println("opción inválida");
				break;
				} 
		
			 
			 }
			 if (op1 == 2) {
				if (p1.equals("si")) {
					System.out.println(n1+", Resultado de la prueba es: "+ r1);
				}
				if (p2.equals("si")) {
					System.out.println(n2+", Resultado de la prueba es: "+ r2);
				}
				if (p3.equals("si")) {
					System.out.println(n3+", Resultado de la prueba es: "+ r3);
				}
				if (p4.equals("si")) {
					System.out.println(n4+", Resultado de la prueba es: "+ r4);
				}
				if (p5.equals("si")) {
					System.out.println(n5+", Resultado de la prueba es: "+ r5);
				}
				if (p6.equals("si")) {
					System.out.println(n6+", Resultado de la prueba es: "+ r6);
				}
				if (p7.equals("si")) {
					System.out.println(n7+", Resultado de la prueba es: "+ r7);
				}
				if (p8.equals("si")) {
					System.out.println(n8+", Resultado de la prueba es: "+ r8);
				}
				
			}
			 if (op1 == 3) {
				System.out.println("Fin del programa");
			}
		}

	}

}
