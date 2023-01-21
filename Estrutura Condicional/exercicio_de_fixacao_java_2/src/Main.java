import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("Insira um valor: ");
		x = sc.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("Valor PAR.");
		}
		else {
			System.out.println("Valor ÍMPAR.");
		sc.close();
		
		}
		
	}

}
