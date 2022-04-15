Proceso sin_titulo
	Definir anotaciones Como Caracter;
	Definir op, op1, op2 Como Entero;
	
	Escribir "Elija una opción: ";
	Escribir "1. Medicamentos disponibles";
	Escribir "2. Precio por medicamento";
	Escribir "3. Devolucion de medicamentos";
	Escribir "4. Salir";
	Leer op;
	
	Segun op Hacer
		1:
			Escribir ".:Elija su medicamento:.";
			Escribir "1. Simvastatina - para controlar el colesterol";
			Escribir "2. Omeprazol - para la acidez de estómago";
			Escribir "3. Ramipril - para la hipertensión";
			Escribir "4. Paracetamol - para aliviar el dolor";
			Escribir "5. Salbutamol - para el asma";
			Leer op1;
			Segun op1 Hacer
				1: Escribir "Compraste Simvastatina";
				2: Escribir "Compraste Omeprazol";
				3: Escribir "Compraste Ramipril";
				4: Escribir "Compraste Paracetamol";
				5: Escribir "Compraste Salbutamol";
			FinSegun
		2:
			Escribir "   Producto  ", "  Precio   ";
			Escribir "Simvastatina ", "  $5.000   ";
			Escribir "Omeprazol", "      $12.000   ";
			Escribir "Ramipril", "       $10.000   ";
			Escribir "Paracetamol", "    $15.000   ";
			Escribir "Salbutamol", "     $11.000   ";
		3:
			Escribir ".:Elija su medicamento a devolver:.";
			Escribir "1. Simvastatina";
			Escribir "2. Omeprazol";
			Escribir "3. Ramipril";
			Escribir "4. Paracetamol";
			Escribir "5. Salbutamol";
			Leer op2;
			Segun op2 Hacer
				1: Escribir "Devolviste Simvastatina";
				2: Escribir "Devolviste Omeprazol";
				3: Escribir "Devolviste Ramipril";
				4: Escribir "Devolviste Paracetamol";
				5: Escribir "Devolviste Salbutamol";
			FinSegun
		4:
			Escribir "!Hasta Luego¡";
			
	FinSegun
	
	
FinProceso
