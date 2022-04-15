Proceso sin_titulo
	Definir p1,p2,p3,p4,p5,p6,p7,p8 Como Caracter;
	Definir n1,n2,n3,n4,n5,n6,n7,n8 Como Caracter;
	Definir r1,r2,r3,r4,r5,r6,r7,r8 Como Caracter;
	Definir op1,op2,i Como Entero;
	op1<- 0;
	p1<-"";p2<-"";p3<-"";p4<-"";p5<-"";p6<-"";p7<-"";p8<-"";
	n1<-"";n2<-"";n3<-"";n4<-"";n5<-"";n6<-"";n7<-"";n8<-"";
	r1<-"";r2<-"";r3<-"";r4<-"";r5<-"";r6<-"";r7<-"";r8<-"";
	
	Mientras op1 <> 3 Hacer
		Escribir " .:MENU USUARIO:.";
		Escribir "1. Ingresar aprendiz";
		Escribir "2. Consulta de usuarios que presentaron prueba";
		Escribir "3. Salir del sistema";
		Leer op1;
		
		Si op1 = 1 Entonces
			Escribir "Hay ocho cupos, elige uno: ";
			Escribir "[1,2,3,4,5,6,7,8]";
			Leer op2;
			
			Segun op2 Hacer
				1:
					Escribir "Escriba nombre del aprendiz: ";
					Leer n1;
					Escribir "¿Presentaste la prueba? (si o no)";
					Leer p1;
					Limpiar Pantalla;
					Si p1 = "si" Entonces
						Escribir "por favor escriba el resultado: (aprobo o reprobo)";
						Leer r1;
					FinSi
				2:
					Escribir "Escriba nombre del aprendiz: ";
					Leer n2;
					Escribir "¿Presentaste la prueba? (si o no)";
					Leer p2;
					Limpiar Pantalla;
					Si p2 = "si" Entonces
						Escribir "por favor escriba el resultado: (aprobo o reprobo)";
						Leer r2;
					FinSi
				3:
					Escribir "Escriba nombre del aprendiz: ";
					Leer n3;
					Escribir "¿Presentaste la prueba? (si o no)";
					Leer p3;
					Limpiar Pantalla;
					Si p3 = "si" Entonces
						Escribir "por favor escriba el resultado: (aprobo o reprobo)";
						Leer r3;
					FinSi
				4:
					Escribir "Escriba nombre del aprendiz: ";
					Leer n4;
					Escribir "¿Presentaste la prueba? (si o no)";
					Leer p4;
					Limpiar Pantalla;
					Si p4 = "si" Entonces
						Escribir "por favor escriba el resultado: (aprobo o reprobo)";
						Leer r4;
					FinSi
				5:
					Escribir "Escriba nombre del aprendiz: ";
					Leer n5;
					Escribir "¿Presentaste la prueba? (si o no)";
					Leer p5;
					Limpiar Pantalla;
					Si p5 = "si" Entonces
						Escribir "por favor escriba el resultado: (aprobo o reprobo)";
						Leer r5;
					FinSi
				6:
					Escribir "Escriba nombre del aprendiz: ";
					Leer n6;
					Escribir "¿Presentaste la prueba? (si o no)";
					Leer p6;
					Limpiar Pantalla;
					Si p6 = "si" Entonces
						Escribir "por favor escriba el resultado: (aprobo o reprobo)";
						Leer r6;
					FinSi
				7:
					Escribir "Escriba nombre del aprendiz: ";
					Leer n7;
					Escribir "¿Presentaste la prueba? (si o no)";
					Leer p7;
					Limpiar Pantalla;
					Si p7 = "si" Entonces
						Escribir "por favor escriba el resultado: (aprobo o reprobo)";
						Leer r7;
					FinSi
				8:
					Escribir "Escriba nombre del aprendiz: ";
					Leer n8;
					Escribir "¿Presentaste la prueba? (si o no)";
					Leer p8;
					Limpiar Pantalla;
					Si p8 = "si" Entonces
						Escribir "por favor escriba el resultado: (aprobo o reprobo)";
						Leer r8;
					FinSi
				De Otro Modo:
					Limpiar Pantalla;
					Escribir "opción inválida";
			FinSegun
		FinSi
		
			Limpiar Pantalla;
			Si op1 = 2 Entonces
				Si p1 = "si" Entonces
					Escribir n1,", Resultado de la prueba es: ", r1;
				FinSi
				Si p2 = "si" Entonces
					Escribir n2,", Resultado de la prueba es: ", r2;
				FinSi
				Si p3 = "si" Entonces
					Escribir n3,", Resultado de la prueba es: ", r3;
				FinSi
				Si p4 = "si" Entonces
					Escribir n4,", Resultado de la prueba es: ", r4;
				FinSi
				Si p5 = "si" Entonces
					Escribir n5,", Resultado de la prueba es: ", r5;
				FinSi
				Si p6 = "si" Entonces
					Escribir n6,", Resultado de la prueba es: ", r6;
				FinSi
				Si p7 = "si" Entonces
					Escribir n7,", Resultado de la prueba es: ", r7;
				FinSi
				Si p8 = "si" Entonces
					Escribir n8,", Resultado de la prueba es: ", r8;
				FinSi
			FinSi

	FinMientras

FinProceso
