
public class Tres {

	public static void main(String[] args) {
		int    p, contador;
		
		System.out.println(".:NUMEROS PRIMOS DE 1 A 1000:.");
		for (int i = 0; i < 1000; i++) {
			p = 1;
			contador = 0;
			while (p <= i) {
				if (i % p == 0) {
					contador++;
				}
				p++;
			}
			if (contador == 2) {
				System.out.println(i);
			}
		}

	}

}
