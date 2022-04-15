Proceso sin_titulo
	Definir peso, estatura, imc Como Real;
	
	Escribir "Ingrese su peso en kilogramos";
	Leer peso;
	Escribir "Ingrese su estatura en metros";
	Leer estatura;
	
	imc <- 	peso / (estatura)^2;
	Escribir "Su índice de masa corporal es: ", imc;
	Si imc < 18.5 Entonces
		Escribir "Está bajo de peso";
	FinSi
	Si imc > 18.5 y imc < 24.9 Entonces
		Escribir "Tiene un peso Normal";
	FinSi
	Si imc > 25 y imc < 29.9 Entonces
		Escribir "Tiene sobrepeso";
	FinSi
	Si imc > 30 Entonces
		Escribir "Tiene obesidad";
	FinSi
		
FinProceso
