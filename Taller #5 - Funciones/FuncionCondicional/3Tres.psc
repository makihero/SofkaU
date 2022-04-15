SubProceso dato ( nombre,apellido,edad )
	Escribir "¿Cuál es su nombre?";
	Leer nombre;
	Escribir "¿Cuál es su apellido?";
	Leer apellido;
	Escribir "¿Qué edad tienes?";
	Leer edad;
	
	Si edad >= 18 Entonces
		Escribir nombre, " ", apellido, " usted es mayor de edad, por lo tanto puede entrar a la fiesta";
	SiNo
		Escribir nombre, " ", apellido, " usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa";
	FinSi
FinSubProceso


Proceso funDato
	Definir nombre, apellido Como Caracter;
	Definir edad Como Entero;
	nombre<-"";apellido<-"";
	edad<-0;
	dato(nombre,apellido,edad);
	
	
FinProceso
