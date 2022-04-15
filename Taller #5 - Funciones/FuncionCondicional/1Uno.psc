SubProceso respuesta <- calcularEdad ( edad )
	Definir respuesta Como Caracter;
	
	Escribir "¿Cuál es su edad?";
	Leer edad;
	Si edad >= 18 Entonces
		respuesta <- "Usted es mayor de edad";
	FinSi	
FinSubProceso

Proceso funcionEdad
	Definir edad Como Entero;
	edad<-0;
	Escribir calcularEdad(edad);
	
	
FinProceso
