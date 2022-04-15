SubProceso respuesta <- calcularEdad ( edad )
	Definir respuesta Como Caracter;
	Escribir "¿Cuál es su edad?";
	Leer edad;
	
	Si edad < 18 Entonces
		respuesta <- "Usted aún es un niño(a)";
	FinSi
FinSubProceso


Proceso funEdad
	Definir edad Como Entero;
	edad<-0;
	Escribir calcularEdad(edad);
	
FinProceso
