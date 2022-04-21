import java.util.Scanner;

public class Siete {

	public static void main(String[] args) {
		String  n1,n2,n3,n4,n5,p1,p2,p3,p4,p5,m1,m2,m3,m4,m5,t1,t2,t3,t4,t5, usuario, consulta, retiro, vacio;
		int     op,i;
		boolean conteo;
		
		t1="";t2="";t3="";t4="";t5="";
		m1="";m2="";m3="";m4="";m5="";
		n1="";n2="";n3="";n4="";n5="";
		p1="";p2="";p3="";p4="";p5="";
		conteo = true;
		vacio = "sin datos";
		usuario = "";
		
		do {
			Scanner sc = new Scanner(System.in);
			 System.out.println("      .:PARQUEADERO:. ");
			 System.out.println("1. Ingresar vehículo");
			 System.out.println("2. Retirar vehículo");
			 System.out.println("3. Consultar por placa");
			 System.out.println("4. Salir");
			 op = sc.nextInt();
			
			 switch (op) {
				case 1:
					i = 0;
					do {
						System.out.println("Ingresar nombre completo: ");
						System.out.println("Ingresar número de placa: ");
						System.out.println("Ingresar marca de la moto: ");
						System.out.println("Ingresar numero telefónico: ");
						System.out.println("¿Desea ingresar otro usuario?(si/no): ");
						i++;
						if (i == 1) {
							n1 = sc.next();
							p1 = sc.next();
							m1 = sc.next();
							t1 = sc.next();
							usuario = sc.next();
						}else if (i == 2) {
							n2 = sc.next();
							p2 = sc.next();
							m2 = sc.next();
							t2 = sc.next();
							usuario = sc.next();
						}else if (i == 3) {
							n3 = sc.next();
							p3 = sc.next();
							m3 = sc.next();
							t3 = sc.next();
							usuario = sc.next();
						}else if (i == 4) {
							n4 = sc.next();
							p4 = sc.next();
							m4 = sc.next();
							t4 = sc.next();
							usuario = sc.next();
						}else if (i == 5) {
							n5 = sc.next();
							p5 = sc.next();
							m5 = sc.next();
							t5 = sc.next();
							usuario = sc.next();
						}	
					} while (usuario == "no" || i == 5);
					break;
				case 2:
					System.out.println("     .:RETIRAR VEHICULO:.");
					System.out.println("Ingresar placa del vehículo: ");
					retiro = sc.next();
					if (retiro.equals(p1)) {
						System.out.println("El vehículo de "+n1+" ¡Fué retirado!");
						n1 = vacio;
						p1 = vacio;
						m1 = vacio;
						t1 = vacio;
						System.out.println("Hasta luego");
					}else if (retiro.equals(p2)) {
						System.out.println("El vehículo de "+n2+" ¡Fué retirado!");
						n2 = vacio;
						p2 = vacio;
						m2 = vacio;
						t2 = vacio;
						System.out.println("Hasta luego");
					}else if (retiro.equals(p3)) {
						System.out.println("El vehículo de "+n3+" ¡Fué retirado!");
						n3 = vacio;
						p3 = vacio;
						m3 = vacio;
						t3 = vacio;
						System.out.println("Hasta luego");
					}else if (retiro.equals(p4)) {
						System.out.println("El vehículo de "+n4+" ¡Fué retirado!");
						n4 = vacio;
						p4 = vacio;
						m4 = vacio;
						t4 = vacio;
						System.out.println("Hasta luego");
					}else if (retiro.equals(p5)) {
						System.out.println("El vehículo de "+n5+" ¡Fué retirado!");
						n5 = vacio;
						p5 = vacio;
						m5 = vacio;
						t5 = vacio;
						System.out.println("Hasta luego");
					}
					break;
				case 3:
					System.out.println("     .:CONSULTA POR PLACA:.");
					System.out.println("        Ingresar placa: ");
					consulta = sc.next();
					if (consulta.equals(p1 )) {
						System.out.println("Nombre: "+ n1+ " Marca: "+ m1+ " Placa: "+ p1+ " Teléfono: "+ t1);
					}else if (consulta.equals(p2)) {
						System.out.println("Nombre: "+ n2+ " Marca: "+ m2+ " Placa: "+ p2+ " Teléfono: "+ t2);
					}else if (consulta.equals(p3)) {
						System.out.println("Nombre: "+ n3+ " Marca: "+ m3+ " Placa: "+ p3+ " Teléfono: "+ t3);
					}else if (consulta.equals(p4)) {
						System.out.println("Nombre: "+ n4+ " Marca: "+ m4+ " Placa: "+ p4+ " Teléfono: "+ t4);
					}else if (consulta.equals(p5)) {
						System.out.println("Nombre: "+ n5+ " Marca: "+ m5+ " Placa: "+ p5+ " Teléfono: "+ t5);
					}else{
						System.out.println("Número de placa inválido");
					}
					break;
				case 4:
					System.out.println("Hasta luego, Gracias por usar nuestro servicio");
					conteo = false;
				default:
					System.out.println("¡opción inválida!");
					break;
			}

			
			
		} while (conteo != false);
	}
}
