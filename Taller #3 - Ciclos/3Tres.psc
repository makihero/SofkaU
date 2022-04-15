Proceso sin_titulo
	Definir i, h, j Como Entero;
	Definir linea Como Caracter;
    
	i <- 11;
	
	Repetir
		
		h <- 0;
		j <- 0;
		Repetir 
			Escribir " " Sin Saltar;
			h <- h + 1;
		Hasta Que  h = i	
		Repetir
			Escribir Sin Saltar "*";
			j <- j + 1;
		Hasta Que  j = 12 - i
		
		j <- 0;
		
		Si i <> 11 Entonces
			Repetir
				Escribir Sin Saltar "*";
				j <- j + 1;
			Hasta Que  j = 11 - i
		FinSi
		
		Escribir "";
		i<- i - 1;
		
	Hasta Que  i = 0
	
	i <- 10;
	
	Repetir
		
		h <- 0;
		j <- 0;
		
		Repetir 
			Escribir Sin Saltar " ";
			h <- h + 1;
		Hasta Que  h = i
		
		Repetir
			Escribir Sin Saltar "*";
			j <- j + 1;
		Hasta Que  j = 12 - i
		
		j <- 0;
		
		Si i <> 11 Entonces
			Repetir
				Escribir Sin Saltar "*";
				j <- j + 1;
			Hasta Que  j = 11 - i
		FinSi
		
		Escribir "";
		i<- i - 1;
		
	Hasta Que  i = 9
	
	i <- 10;
	
	Repetir
		
		h <- 0;
		j <- 0;
		
		Repetir 
			Escribir Sin Saltar " ";
			h <- h + 1;
		Hasta Que  h = i
		
		Repetir
			Escribir Sin Saltar "*";
			j <- j + 1;
		Hasta Que  j = 12 - i
		
		j <- 0;
		
		Si i <> 11 Entonces
			Repetir
				Escribir Sin Saltar "*";
				j <- j + 1;
			Hasta Que  j = 11 - i
		FinSi
		Escribir "";
		i<- i - 1;
		
	Hasta Que  i = 7
	
FinProceso

