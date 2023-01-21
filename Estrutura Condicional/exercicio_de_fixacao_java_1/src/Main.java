import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um número inteiro: ");
		x = sc.nextInt();
		
		if (x<0) {
			System.out.println("NEGATIVO.");
		}
		else {
			System.out.println("POSITIVO.");
		}
		sc.close();
	}

}
