
public class Tres {

	public static void main(String[] args) {
		int i, j, k, n, off;
		i = 0;
		j = 0;
		k = 0;
		n = 10;
		n=n*2-1; 
		off = (n - 3) / 2;
//		
		do {
			do {
				System.out.print(" ");
				j+=2;
			} while (j <= n);
			do {
				System.out.print("*");
				k++;
			} while (k <= i);
			System.out.println();
			i+=2;
			j = i;
			k = k - i;
		} while (i <= n);


		for (int o = 1; o <= 2; o++) {
		    
		    for (int p = 0; p < off; p++) {
		        System.out.print(" ");
		    }

		    System.out.println(" ***");
		}
		

	}	

}
