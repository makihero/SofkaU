SubProceso pelicula ( anotaciones,op,op1 )
	Escribir "Elija una opci�n: ";
	Escribir "1. Alquilar pel�cula";
	Escribir "2. Consultar pel�culas";
	Escribir "3. Recibir pel�cula";
	Escribir "4. Salir";
	Leer op;

	Segun op Hacer
		1:
			Escribir ".:Elige la Pel�cula que te guste:.";
			Escribir "1. El Aro";
			Escribir "2. Los Vengadores";
			Escribir "3. Harry Potter";
			Escribir "4. Dragon Ball Z";
			Escribir "5. Camino Hacia el Terror";
			Leer op1;
			Segun op1 Hacer
				1: Escribir "Alquilaste El Aro";
				2: Escribir "Alquilaste Los Vengadores";
				3: Escribir "Alquilaste Harry Potter";
				4: Escribir "Alquilaste Dragon Ball Z";
				5: Escribir "Alquilaste Camino Hacia el Terror";
			FinSegun
		2:
			Escribir ".:Pel�culas Disponibles:.";
			Escribir "El Aro";
			Escribir "Los Vengadores";
			Escribir "Harry Potter";
			Escribir "Dragon Ball Z";
			Escribir "Camino Hacia el Terror";
		3:
			Escribir "Anotaciones o novedades sobre la pel�cula";
			Leer anotaciones;
			Escribir "Gracias por sus observaciones, nos ayuda a mejorar";
		4:
			Escribir "Hasta luego, gracias por visitarnos";
			
	FinSegun
FinSubProceso


Proceso funPelicula
	Definir anotaciones Como Caracter;
	Definir op, op1 Como Entero;
	anotaciones<-"";
	op<-0;op1<-0;
	pelicula(anotaciones,op,op1);
	
	
FinProceso







