SubProceso arreglo ( i, vector )
	Escribir "Digite n�mero en la pocisi�n 1:";
	Leer vector[0];
	Escribir "Digite n�mero en la pocisi�n 2:";
	Leer vector[1];
	Escribir "Digite n�mero en la pocisi�n 3:";
	Leer vector[2];
	Escribir "Digite n�mero en la pocisi�n 4:";
	Leer vector[3];
	Escribir "Digite n�mero en la pocisi�n 5:";
	Leer vector[4];
	
	Limpiar Pantalla;
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Escribir "[",i,"]", " = ",vector[i];
	FinPara
FinSubProceso


Proceso funArreglo
	Definir i, vector Como Entero;
	Dimension vector[5];
	i<-0;
	arreglo(i,vector);
	
FinProceso
