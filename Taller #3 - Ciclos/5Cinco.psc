Proceso sin_titulo
	Definir op Como Entero;
	Definir nombre Como Caracter;
	
	Repetir
		Escribir "Men� de Usuario";
		Escribir "1. Capturar nombre";
		Escribir "2. Saludar persona";
		Escribir "3. Salir del sistema";
		Leer op;
		
		Limpiar Pantalla;
		Segun op Hacer
			1:
				Escribir "Por favor, escriba su nombre";
				Leer nombre;
			2:
				Escribir "Hola, ", nombre, " saludos.";
				
			3:
				Escribir "!Hasta luego�";
			De Otro Modo:
				Escribir "!opci�n inv�lida�";
		FinSegun
	Hasta Que op = 3;
	
	
FinProceso
