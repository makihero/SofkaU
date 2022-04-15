Proceso sin_titulo
	Definir f, c, tabla, fu, cu Como Entero;
	Dimension tabla[11, 11];
	
	Para f<-1 Hasta 10 Hacer
		Para c<-1 Hasta 10 Hacer
			tabla[f, c] <- (f * c);
		FinPara
	FinPara
	
	Para f<-1 Hasta 10 Hacer
		Para c<-1 Hasta 10 Hacer
			Escribir Sin Saltar tabla[f, c], " ";
		FinPara
		Escribir "";
	FinPara
	
	Escribir "Ingresar fila: ";
	Leer fu;
	Escribir "Ingresar columna";
	Leer cu;
	
	Escribir "El número es: ", tabla[fu,cu];
	
	
FinProceso
