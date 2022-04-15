SubProceso agenda ( nombres,n1,n2,n3,contactos,c1,c2,c3,empresas,o1,o2,o3,op,conteo,telefono )
	Mientras op <> 6 Hacer
		Escribir "Agenda de contactos, elegir opcion: ";
		Escribir "1. Digite nombre completo";
		Escribir "2. Digite numero de contacto";
		Escribir "3. Digite nombre de empresa";
		Escribir "4. Buscar contactos";
		Escribir "5. Borrar contactos";
		Escribir "6. Salir";
		Leer op;
		
		Mientras op = 5 Hacer
			Limpiar Pantalla;
			n1 <- "sin asignar";
			n2 <- "sin asignar";
			n3 <- "sin asignar";
			c1 <- "sin asignar";
			c2 <- "sin asignar";
			c3 <- "sin asignar";
			o1 <- "sin asignar";
			o2 <- "sin asignar";
			o3 <- "sin asignar";
			Escribir "Contacto n° 1: ", n1, " Telefono: ", c1, " Empresa: ", o1;
			Escribir "Contacto n° 2: ", n2, " Telefono: ", c2, " Empresa: ", o2;
			Escribir "Contacto n° 3: ", n3, " Telefono: ", c3, " Empresa: ", o3;
			Escribir "[ENTER] volver al menu.";
			Leer op;
			Limpiar Pantalla;
		FinMientras
		
		Mientras op = 4 Hacer
			Limpiar Pantalla;
			Escribir "          .:CONTACTOS:.";
			Escribir "Contacto n° 1: ", n1, " Telefono: ", c1, " Empresa: ", o1;
			Escribir "Contacto n° 2: ", n2, " Telefono: ", c2, " Empresa: ", o2;
			Escribir "Contacto n° 3: ", n3, " Telefono: ", c3, " Empresa: ", o3;
			Escribir "[ENTER] volver al menu.";
			Leer op;
			Limpiar Pantalla;
		FinMientras
		
		Mientras op = 1  Hacer
			Limpiar pantalla;
			conteo <- conteo + 1;
			Si conteo > 3 Entonces
				Escribir "Agenda llena, presionar enter para volver";
				op <- 2;
			SiNo
				Escribir "Escriba nombre completo: ";
				
			FinSi
			Leer nombres;
			Si conteo = 1 Entonces
				n1 <- nombres;
			SiNo
				Si conteo = 2 Entonces
					n2 <- nombres;
				SiNo
					Si conteo = 3 Entonces
						n3 <- nombres;
					SiNo
						Escribir "Agenda llena, enter para volver";
					FinSi
				FinSi
				Limpiar Pantalla;
			FinSi
			op <- 7;
		FinMientras
		
		Mientras op = 2 Hacer
			Limpiar Pantalla;
			Escribir "          .:CONTACTOS INGRESADOS:.";
			Escribir "Contacto n° 1: ", n1, " Telefono: ", c1, " Empresa: ", o1;
			Escribir "Contacto n° 2: ", n2, " Telefono: ", c2, " Empresa: ", o2;
			Escribir "Contacto n° 3: ", n3, " Telefono: ", c3, " Empresa: ", o3;
			Escribir "Ingresar numero de contacto a guardar o [7] volver al menu.";
			telefono <- 0;;
			Leer telefono;
			Si telefono = 1 Entonces
				Escribir "Ingresar número telefonico: ";
				Leer c1;
				Limpiar Pantalla;
				Escribir "Contacto guardado: ", n1, " Telefono: ", c1;
			SiNo
				Si telefono = 2 Entonces
					Escribir "Ingresar número telefonico: ";
					Leer c2;
					Limpiar Pantalla;
					Escribir "Contacto guardado: ", n2, " Telefono: ", c2;
				SiNo
					Si telefono = 3 Entonces
						Escribir "Ingresar número telefonico: ";
						Leer c3;
						Limpiar Pantalla;
						Escribir "Contacto guardado: ", n3, " Telefono: ", c3;
					SiNo
						Si telefono > 3 Entonces
							Limpiar Pantalla;
						SiNo
							Escribir "Opcion inválida";
						FinSi
					FinSi	
				FinSi
				op <- 7;
			FinSi
			
		FinMientras
		
		Mientras op = 3 Hacer
			Limpiar Pantalla;
			Escribir "          .:CONTACTOS INGRESADOS:.";
			Escribir "Contacto n° 1: ", n1, " Telefono: ", c1, " Empresa: ", o1;
			Escribir "Contacto n° 2: ", n2, " Telefono: ", c2, " Empresa: ", o2;
			Escribir "Contacto n° 3: ", n3, " Telefono: ", c3, " Empresa: ", o3;
			Escribir "Ingresar numero de contacto a guardarle la empresa o [7] volver al menu.";
			telefono <- 0;;
			Leer telefono;
			Si telefono = 1 Entonces
				Escribir "Ingresar nombre de la empresa: ";
				Leer o1;
				Limpiar Pantalla;
				Escribir "Contacto guardado: ", n1, " Telefono: ", c1, " Empresa: ", o1;
			SiNo
				Si telefono = 2 Entonces
					Escribir "Ingresar nombre de la empresa: ";
					Leer o2;
					Limpiar Pantalla;
					Escribir "Contacto guardado: ", n2, " Telefono: ", c2, " Empresa: ", o2;
				SiNo
					Si telefono = 3 Entonces
						Escribir "Ingresar nombre de la empresa: ";
						Leer o3;
						Limpiar Pantalla;
						Escribir "Contacto guardado: ", n3, " Telefono: ", c3, " Empresa: ", o3;
					SiNo
						Si telefono > 3 Entonces
							Limpiar Pantalla;
						SiNo
							Escribir "Opcion inválida";
						FinSi
						
					FinSi
					
				FinSi
				op <- 7;
			FinSi
			
		FinMientras
		
	FinMientras
FinSubProceso


Proceso funAgenda
	Definir op, conteo, telefono Como Entero;
	Definir nombres, n1, n2, n3, contactos, c1, c2, c3, empresas, o1, o2, o3 Como Caracter;
	op<-0;conteo<-0;
	n1 <- "";n2 <- "";n3 <- "";c1 <- "";c2 <- "";c3 <- "";o1 <- "";o2 <- "";o3 <- "";nombres<-"";contactos<-"";empresas<-"";telefono<-0;
	agenda(nombres,n1,n2,n3,contactos,c1,c2,c3,empresas,o1,o2,o3,op,conteo,telefono);
	
	

FinProceso
