Proceso sin_titulo
	Definir op Como Entero;
	Definir base, base1, altura, areaRectangulo, areaTriangulo, areaTrapecio  Como Real;
		
	Escribir "Elija una opci�n: ";
	Escribir "1. Calcular area rect�ngulo";
	Escribir "2. Calcular area tri�ngulo";
	Escribir "3. Calcular area trapecio";
	Escribir "4. Salir";
	Leer op;
	
	Segun op Hacer
		1:
			Escribir "Escriba la base del rect�ngulo: ";
			Leer base;
			Escribir "Escriba la altura del rect�ngulo: ";
			Leer altura;
			areaRectangulo <- base * altura;
			Escribir "El area del Rect�ngulo es: ", areaRectangulo;
		2:
			Escribir "Escriba la base del tri�ngulo: ";
			Leer base;
			Escribir "Escriba la altura del tri�ngulo: ";
			Leer altura;
			areaTriangulo <- (base * altura)/2;
			Escribir "El area del tri�ngulo es: ", areaTriangulo;
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
			Escribir "!Hasta Luego�";
		
	FinSegun
	
	
FinProceso
