Proceso sin_titulo
	Definir i, j, n, k Como Entero;
	n <- 10;
	i <- 1;
	j <- 9;
	k <- 1;
	
	Mientras k <= n Hacer
		Mientras i < n Hacer
			Escribir ' ' Sin Saltar;
			i <- i + 1;
		FinMientras
		Mientras j < n Hacer
			Escribir '*' Sin Saltar;
			j <- j + 1;
		FinMientras
		k <- k + 1;
		i <- k;
		j <- j - k;
		Escribir '';
	FinMientras
	
	
FinAlgoritmo