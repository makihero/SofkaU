SubProceso taller ( observacion,repuesto,repuesto,op )
	Escribir "Elija una opci�n: ";
	Escribir "1. Ingresar motocicleta";
	Escribir "2. Arreglos mec�nico";
	Escribir "3. Salir";
	Leer op;
	
	Segun op Hacer
		1:
			Escribir "Para ingresar, Por favor digite observaciones";
			Leer observacion;
			Escribir "Registro exitoso, Falla: ", "[",observacion,"]";
		2:
			Escribir "Por favor, ingrese observaciones";
			Leer observacion;
			Escribir "Us� algun repuesto para la reparaci�n(s/n)";
			Leer repuesto;
			Si repuesto = "s" Entonces
				Escribir "Digite los repuestos que se us�";
				Leer repuestos;
				Escribir "Para la falla: ", "[",observacion,"]", " se us� los repuestos: ", repuestos;
			FinSi
		3:
			Escribir "!Hasta Luego�";
			
	FinSegun
	
FinSubProceso


Proceso sin_titulo
	Definir observacion, repuesto, repuestos Como Caracter;
	Definir op Como Entero;
	observacion<-"";repuesto<-"";repuestos<-"";
	op<-0;
	taller(observacion,repuesto,repuestos,op);	
	
FinProceso
