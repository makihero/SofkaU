Proceso sin_titulo
	Definir op, op1, t1, t2, t3, t4, t5, compra Como Entero;
	
	Escribir "Elija una opción: ";
	Escribir "1. Tortas disponibles";
	Escribir "2. Salir";
	Leer op;
	
	t1 <- 12;
	t2 <- 8;
	t3 <- 10;
	t4 <- 10;
	t5 <- 12;
	
	
	
	Segun op Hacer
		1: 
			Escribir "Elegir torta";
			Escribir "1.Torta mousse de chocolate y baileys ", t1, " Und. disponibles";
			Escribir "2.Torta de fresas con crema de vainilla ", t2, " Und. disponibles";
			Escribir "3.Torta Cheesecake de Nutella ", t3, " Und. disponibles";
			Escribir "4.Torta fácil de hojaldre con fresas y almendra ", t4, " Und. disponibles";
			Escribir "5.Torta ganache de chocolate y banano ", t5, " Und. disponibles";
			Leer op1;
			
			Segun op1 Hacer
				1:  Escribir "¿Cuantas Tortas desea?";
					Leer compra;
					t1 <- t1 - compra;
					Escribir "Se vende ", compra, " Torta mousse ", t1, " Und. disponibles";
				2: Escribir "¿Cuantas Tortas desea?";
					Leer compra;
					t2 <- t2 - compra;
					Escribir "Se vende ", compra, " Torta de fresas  ", t2, " Und. disponibles";
				3: Escribir "¿Cuantas Tortas desea?";
					Leer compra;
					t3 <- t3 - compra;
					Escribir "Se vende ", compra, " Torta Cheesecake ", t3, " Und. disponibles";
				4: Escribir "¿Cuantas Tortas desea?";
					Leer compra;
					t4 <- t4 - compra;
					Escribir "Se vende ", compra, " Torta fácil de hojaldre ", t4, " Und. disponibles";
				5: Escribir "¿Cuantas Tortas desea?";
					Leer compra;
					t5 <- t5 - compra;
					Escribir "Se vende ", compra, " Torta ganache ", t5, " Und. disponibles";
			FinSegun
		2:
			Escribir "!Hasta Luego¡";	
			
		
		
	FinSegun
	
	
	
FinProceso
