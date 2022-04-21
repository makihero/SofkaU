import java.util.Scanner;

public class Uno {

	public static void main(String[] args) {
		int vector[];
		vector = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite número en la pocisión 1:");
		vector[0] = sc.nextInt();
		System.out.println("Digite número en la pocisión 2:");
		vector[1] = sc.nextInt();
		System.out.println("Digite número en la pocisión 3:");
		vector[2] = sc.nextInt();
		System.out.println("Digite número en la pocisión 4:");
		vector[3] = sc.nextInt();
		System.out.println("Digite número en la pocisión 5:");
		vector[4] = sc.nextInt();
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println("["+i+"]"+ " = "+vector[i]);
		}		
		
	}

}
