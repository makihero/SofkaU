SubProceso paresImpares ( i,j, k, arreglo )
	Para i<-1 Hasta 19 Con Paso 1 Hacer
		arreglo[i] <- azar(100);
	FinPara
	
	Escribir Sin Saltar "Números pares: ";
	Para j<-1 Hasta 19 Con Paso 1 Hacer
		Si arreglo[j] % 2 = 0 Entonces
			Escribir  Sin Saltar arreglo[j], ", ";
		SiNo
			
		FinSi
	FinPara
	Escribir "";
	
	Escribir Sin Saltar "Números impares: ";
	Para j<-1 Hasta 19 Con Paso 1 Hacer
		Si arreglo[j] % 2 <> 0 Entonces
			Escribir  Sin Saltar arreglo[j], ", ";
		SiNo
			
		FinSi
	FinPara
	Escribir "";
FinSubProceso


Proceso funParesImpares
	Definir i,j, k, arreglo Como Entero;
	Dimension arreglo[20];
	i<-0;j<-0;k<-0;
	
	paresImpares(i,j, k, arreglo);

FinProceso













