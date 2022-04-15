Proceso sin_titulo
	Definir op Como Entero;
	Definir base, base1, altura, areaRectangulo, areaTriangulo, areaTrapecio  Como Real;
		
	Escribir "Elija una opción: ";
	Escribir "1. Calcular area rectángulo";
	Escribir "2. Calcular area triángulo";
	Escribir "3. Calcular area trapecio";
	Escribir "4. Salir";
	Leer op;
	
	Segun op Hacer
		1:
			Escribir "Escriba la base del rectángulo: ";
			Leer base;
			Escribir "Escriba la altura del rectángulo: ";
			Leer altura;
			areaRectangulo <- base * altura;
			Escribir "El area del Rectángulo es: ", areaRectangulo;
		2:
			Escribir "Escriba la base del triángulo: ";
			Leer base;
			Escribir "Escriba la altura del triángulo: ";
			Leer altura;
			areaTriangulo <- (base * altura)/2;
			Escribir "El area del triángulo es: ", areaTriangulo;
		3:
			Escribir "Escriba la base menor del trapecio: ";
			Leer base;
			Escribir "Escriba la base mayor del trapecio: ";
			Leer base1;
			Escribir "Escriba la altura del trapecio: ";
			Leer altura;
			areaTrapecio <- ((base + base1)/2) * altura;
			Escribir "El area del trapecio es: ", areaTrapecio;
		4:
			Escribir "!Hasta Luego¡";
		
	FinSegun
	
	
FinProceso
