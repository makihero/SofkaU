SubProceso respuesta <- calcularEdad ( edad )
	Definir respuesta Como Caracter;
	Escribir "�Cu�l es su edad?";
	Leer edad;
	
	Si edad < 18 Entonces
		respuesta <- "Usted a�n es un ni�o(a)";
	FinSi
FinSubProceso


Proceso funEdad
	Definir edad Como Entero;
	edad<-0;
	Escribir calcularEdad(edad);
	
FinProceso
