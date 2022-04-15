SubProceso primos ( p, num, contador )
	Escribir "                    .:NUMEROS PRIMOS DE 1 A 1000:.";
	Para num<-1 Hasta 1000 Hacer
		p <- 1;
		contador <- 0;
		
		Mientras p <= num  Hacer
			Si num % p == 0 Entonces
				contador <- contador + 1;
			FinSi
			p <- p + 1;
		FinMientras
		
		Si contador == 2 Entonces
			Escribir Sin Saltar num, ", ";
		FinSi
		
	FinPara
FinSubProceso


Proceso funPrimos
	Definir p, num, contador Como Entero;
	p<-1;num<-0;contador<-0;
	
	primos(p, num, contador);
		
		
FinProceso
