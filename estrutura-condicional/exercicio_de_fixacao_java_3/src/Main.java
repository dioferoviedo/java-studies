import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		System.out.println("Insira o primeiro valor: ");
		A = sc.nextInt();
		System.out.println("Insira o segundo valor: ");
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("São múltiplos.");
		}
		else {
			System.out.println("Não são múltiplos.");
		}
		sc.close();
		
	}

}