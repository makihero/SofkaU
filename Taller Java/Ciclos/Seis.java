import java.util.Scanner;

public class Seis {

	public static void main(String[] args) {
		int    op, conteo, telefono;
		String nombres, n1, n2, n3, contactos, c1, c2, c3, empresas, o1, o2, o3;
		op = 0;
		conteo = 0;
		n1 = "";
		n2 = "";
		n3 = "";
		c1 = "";
		c2 = "";
		c3 = "";
		o1 = "";
		o2 = "";
		o3 = "";
		
		while (op != 6) {
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Agenda de contactos, elegir opcion: ");
			 System.out.println("1. Digite nombre completo");
			 System.out.println("2. Digite numero de contacto");
			 System.out.println("3. Digite nombre de empresa");
			 System.out.println("4. Buscar contactos");
			 System.out.println("5. Borrar contactos");
			 System.out.println("6. Salir");
			 op = sc.nextInt();
			 
			 while (op == 5) {
				 n1 = "sin asignar";
					n2 = "sin asignar";
					n3 = "sin asignar";
					c1 = "sin asignar";
					c2 = "sin asignar";
					c3 = "sin asignar";
					o1 = "sin asignar";
					o2 = "sin asignar";
					o3 = "sin asignar";
					System.out.println("Contacto n° 1: "+ n1+ " Telefono: "+ c1+ " Empresa: "+ o1);
					System.out.println("Contacto n° 2: "+ n2+ " Telefono: "+ c2+ " Empresa: "+ o2);
					System.out.println("Contacto n° 3: "+ n3+ " Telefono: "+ c3+ " Empresa: "+ o3);
					System.out.println("[7] volver al menu.");
					op = sc.nextInt();
			}
			while (op == 4) {
				System.out.println("           .:CONTACTOS:.");
				System.out.println("Contacto n° 1: "+ n1+ " Telefono: "+ c1+ " Empresa: "+ o1);
				System.out.println("Contacto n° 2: "+ n2+ " Telefono: "+ c2+ " Empresa: "+ o2);
				System.out.println("Contacto n° 3: "+ n3+ " Telefono: "+ c3+ " Empresa: "+ o3);
				System.out.println("[7] volver al menu.");
				op = sc.nextInt();
			} 
			while (op == 1) {
				conteo++;
				if (conteo > 3) {
					System.out.println("Agenda llena, presionar [7] para volver");
					op = 2;
				} else {
					System.out.println("Escriba nombre completo: ");
				}
				nombres = sc.next();
				if (conteo == 1) {
					n1 = nombres;
				}else{
					if (conteo == 2) {
						n2 = nombres;
					}else{
						if (conteo == 3) {
							n3 = nombres;
						}else{
							System.out.println("Agenda llena, enter para volver");
						}
					}
				}
				op = 7;
			} 
			while (op == 2) {
				System.out.println("           .:CONTACTOS INGRESADOS:.");
				System.out.println("Contacto n° 1: "+ n1+ " Telefono: "+ c1+ " Empresa: "+ o1);
				System.out.println("Contacto n° 2: "+ n2+ " Telefono: "+ c2+ " Empresa: "+ o2);
				System.out.println("Contacto n° 3: "+ n3+ " Telefono: "+ c3+ " Empresa: "+ o3);
				System.out.println("Ingrese número de contacto a guardar o [7] volver al menu.");
				telefono = 0;
				telefono = sc.nextInt();
				if (telefono == 1) {
					System.out.println("Ingresar número telefonico: ");
					c1 = sc.next();
					System.out.println("Contacto guardado: "+n1+ " Teléfono: "+c1);
				}else if (telefono == 2) {
					System.out.println("Ingresar número telefonico: ");
					c2 = sc.next();
					System.out.println("Contacto guardado: "+n2+ " Teléfono: "+c2);
				}else if (telefono == 3) {
					System.out.println("Ingresar número telefonico: ");
					c3 = sc.next();
					System.out.println("Contacto guardado: "+n3+ " Teléfono: "+c3);
				}else if (telefono > 3) {
					op = 7;
				}
			} 
			while (op == 3) {
				System.out.println("           .:CONTACTOS INGRESADOS:.");
				System.out.println("Contacto n° 1: "+ n1+ " Telefono: "+ c1+ " Empresa: "+ o1);
				System.out.println("Contacto n° 2: "+ n2+ " Telefono: "+ c2+ " Empresa: "+ o2);
				System.out.println("Contacto n° 3: "+ n3+ " Telefono: "+ c3+ " Empresa: "+ o3);
				System.out.println("Ingresar numero de contacto a guardarle la empresa o [7] volver al menu.");
				telefono = 0;
				telefono = sc.nextInt();
				if (telefono == 1) {
					System.out.println("Ingresar nombre de la Empresa: ");
					o1 = sc.next();
					System.out.println("Contacto guardado: "+n1+ " Teléfono: "+c1+" Empresa: "+o1);
				}else if (telefono == 2) {
					System.out.println("Ingresar nombre de la Empresa: ");
					o2 = sc.next();
					System.out.println("Contacto guardado: "+n2+ " Teléfono: "+c2+" Empresa: "+o2);
				}else if (telefono == 3) {
					System.out.println("Ingresar nombre de la Empresa: ");
					o3 = sc.next();
					System.out.println("Contacto guardado: "+n3+ " Teléfono: "+c3+" Empresa: "+o3);
				}else if (telefono > 3) {
					op = 7;
				}
			}
			if (op == 6) {
				System.out.println("¡Programa finalizado!");
			}
		}
		
	}

}
