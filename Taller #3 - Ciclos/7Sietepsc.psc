Proceso sin_titulo
	Definir n1,n2,n3,n4,n5,p1,p2,p3,p4,p5,m1,m2,m3,m4,m5,t1,t2,t3,t4,t5, usuario, consulta, retiro, vacio Como Caracter;
	Definir op, i Como Entero;
	Definir conteo Como Logico;
	
	conteo <- Verdadero;
	vacio <- "sin datos";
	
	Repetir
		Escribir "      .:PARQUEADERO:. ";
		Escribir "1. Ingresar veh�culo";
		Escribir "2. Retirar veh�culo";
		Escribir "3. Consultar por placa";
		Escribir "4. Salir";
		Leer op;
		
		Limpiar Pantalla;
		Segun op Hacer
			1:
				i <- 0;
				Repetir
					Escribir "Ingresar nombre completo: ";
					Escribir "Ingresar n�mero de placa: ";
					Escribir "Ingresar marca de la moto: ";
					Escribir "Ingresar numero telef�nico: ";
					Escribir "�Desea ingresar otro usuario?(si/no): ";
					i <- i + 1;
					Si i = 1 Entonces
						Leer n1;
						Leer p1;
						Leer m1;
						Leer t1;
						Leer usuario;
					SiNo
						Si i = 2 Entonces
							Leer n2;
							Leer p2;
							Leer m2;
							Leer t2;
							Leer usuario;
						SiNo
							Si i = 3 Entonces
								Leer n3;
								Leer p3;
								Leer m3;
								Leer t3;
								Leer usuario;
							SiNo
								Si i = 4 Entonces
									Leer n4;
									Leer p4;
									Leer m4;
									Leer t4;
									Leer usuario;
								SiNo
									Si i = 5 Entonces
										Leer n5;
										Leer p5;
										Leer m5;
										Leer t5;
										Leer usuario;
									FinSi
								FinSi
							FinSi
						FinSi
					FinSi
					Limpiar Pantalla;
				Hasta Que usuario = "no" o i = 5;
			2:
				Escribir "     .:RETIRAR VEHICULO:.";
				Escribir "Ingresar placa del veh�culo: ";
				Leer retiro;
				Si retiro = p1 Entonces
					Escribir n1, "�Veh�culo retirado!";
					n1 <- vacio;
					p1 <- vacio;
					m1 <- vacio;
					t1 <- vacio;
					Escribir "Hasta luego";
				SiNo
					Si retiro = p2 Entonces
						Escribir n2, "�Veh�culo retirado!";
						n2 <- vacio;
						p2 <- vacio;
						m2 <- vacio;
						t2 <- vacio;
						Escribir "Hasta luego";
					SiNo
						Si retiro = p3 Entonces
							Escribir n3, "�Veh�culo retirado!";
							n3 <- vacio;
							p3 <- vacio;
							m3 <- vacio;
							t3 <- vacio;
							Escribir "Hasta luego";
						SiNo
							Si retiro = p4 Entonces
								Escribir n4, "�Veh�culo retirado!";
								n4 <- vacio;
								p4 <- vacio;
								m4 <- vacio;
								t4 <- vacio;
								Escribir "Hasta luego";
							SiNo
								Si retiro = p5 Entonces
									Escribir n5, "�Veh�culo retirado!";
									n5 <- vacio;
									p5 <- vacio;
									m5 <- vacio;
									t5 <- vacio;
									Escribir "Hasta luego";
								FinSi
							FinSi
						FinSi
					FinSi
				FinSi
				Escribir "";
			3:
				Escribir "     .:CONSULTA POR PLACA:.";
				Escribir "        Ingresar placa: ";
				Leer consulta;
				Si consulta = p1 Entonces
					Escribir "Nombre: ", n1, " Marca: ", m1, " Placa: ", p1, " Tel�fono: ", t1;
				SiNo
					Si consulta = p2 Entonces
						Escribir "Nombre: ", n2, " Marca: ", m2, " Placa: ", p2, " Tel�fono: ", t2;
					SiNo
						Si consulta = p3 Entonces
							Escribir "Nombre: ", n3, " Marca: ", m3, " Placa: ", p3, " Tel�fono: ", t3;
						SiNo
							Si consulta = p4 Entonces
								Escribir "Nombre: ", n4, " Marca: ", m4, " Placa: ", p4, " Tel�fono: ", t4;
							SiNo
								Si consulta = p5 Entonces
									Escribir "Nombre: ", n5, " Marca: ", m5, " Placa: ", p5, " Tel�fono: ", t5;
								SiNo
									Escribir "n�mero de placa inv�lido";
								FinSi
							FinSi
						FinSi
					FinSi
				FinSi
				Escribir  "";
			4:
				Escribir "Hasta luego, Gracias por usar nuestro servicio";
				conteo <- Falso;
			De Otro Modo:
				Escribir "Opci�n inv�lida";
		FinSegun

	Hasta Que conteo = Falso;
	
FinProceso
