import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um valor: ");
		int x = sc.nextInt();		
		
		int soma= 0;
		while (x!=0) {
			soma += x;
			x = sc.nextInt();
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}