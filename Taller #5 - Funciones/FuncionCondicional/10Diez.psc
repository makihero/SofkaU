SubProceso cajero ( saldo, ingreso, retiro, op )
	Escribir "Por favor, ingresar saldo";
	Leer saldo;
	
	Escribir "Elija una opción: ";
	Escribir "1. Ingresar dinero a su cuenta";
	Escribir "2. Retirar dinero de su cuenta";
	Escribir "3. Consultar saldo";
	Escribir "4. Salir";
	Leer op;
	
	Segun op Hacer
		1:
			Escribir "Digite la cantidad a ingresar: ";
			Leer ingreso;
			Si ingreso >= 0 Entonces
				saldo <- saldo + ingreso;
			SiNo
				Escribir "Saldo incorrecto, digite un valor válido";
			FinSi
			Escribir "Saldo actual: $", saldo;
		2:
			Escribir "Digite la cantidad a retirar: ";
			Leer retiro;
			Si retiro <= saldo y retiro > 0 Entonces
				saldo <- saldo - retiro;
			SiNo
				Escribir "Saldo insuficiente, vuelva a intentarlo";
			FinSi
			Escribir "Saldo actual: $", saldo;
		3:
			Escribir "Saldo actual: $", saldo;
		4:
			Escribir "!Hasta Luego¡";
			
			
	FinSegun
FinSubProceso


Proceso funCajero
	Definir op Como Entero;
	Definir saldo, ingreso, retiro Como Real;
	saldo<-0;ingreso<-0;ratiro<-0;op<-0;
	cajero(saldo, ingreso, retiro, op);

FinProceso
