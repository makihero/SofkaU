Proceso sin_titulo
	Definir matriz, matriz1, fila, columna, f, c, contador Como Entero;
	Dimension matriz1[4,5];
	Dimension matriz[4, 5];
	contador <- 0;
	
	matriz[0,0] <- 01;
	matriz[0,1] <- 02;
	matriz[0,2] <- 03;
	matriz[0,3] <- 04;
	matriz[0,4] <- 05;
	matriz[1,0] <- 10;
	matriz[1,1] <- 09;
	matriz[1,2] <- 08;
	matriz[1,3] <- 07;
	matriz[1,4] <- 06;
	matriz[2,0] <- 11;
	matriz[2,1] <- 12;
	matriz[2,2] <- 13;
	matriz[2,3] <- 14;
	matriz[2,4] <- 15;
	matriz[3,0] <- 20;
	matriz[3,1] <- 19;
	matriz[3,2] <- 18;
	matriz[3,3] <- 17;
	matriz[3,4] <- 16;
	
	Para f<-0 Hasta 3 Hacer
		Para c<-0 Hasta 4 Hacer
			contador <- contador + 1;
			matriz1[f, c] <- contador;
		FinPara
	FinPara
	
	Para f<-0 Hasta 3 Hacer
		Para c<-0 Hasta 4 Hacer
			Escribir Sin Saltar matriz1[f, c], " ";
		FinPara
		Escribir "";
	FinPara
	
	Escribir "----------------";
	Para fila<-0 Hasta 3 Hacer
		Para columna<-0 Hasta 4 Hacer
			Escribir Sin Saltar matriz[fila, columna], " ";
		FinPara
		Escribir "";
	FinPara
	

	
	
	
	
FinProceso
