Proceso sin_titulo
	Definir nombre, apellido Como Caracter;
	Definir edad Como Entero;
	
	Escribir "�Cu�l es su nombre?";
	Leer nombre;
	Escribir "�Cu�l es su apellido?";
	Leer apellido;
	Escribir "�Qu� edad tienes?";
	Leer edad;
	
	Si edad >= 18 Entonces
		Escribir nombre, " ", apellido, " usted es mayor de edad, por lo tanto puede entrar a la fiesta";
	SiNo
		Escribir nombre, " ", apellido, " usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devu�lvase a su casa";
	FinSi
	
FinProceso
