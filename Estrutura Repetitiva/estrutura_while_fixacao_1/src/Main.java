import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a senha: ");
		int senha = sc.nextInt();
		
		while (senha!=2002) {
			System.out.println("Senha inválida.");
			senha = sc.nextInt();
		}
		
		System.out.println("Senha válida.");
		
		sc.close();
	}

}
