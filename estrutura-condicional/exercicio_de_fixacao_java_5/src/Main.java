import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int codigo;
		int quantidade;
		double total;
		
		System.out.println("Insira o código do lanche: ");
		codigo = sc.nextInt();
		System.out.println("Agora sua quantia: ");
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			total = quantidade * 4.0;
		}
		else if	(codigo == 2) {
			total = quantidade * 4.5;
		}
		else if (codigo == 3) {
			total = quantidade * 5.0;
		}
		else if (codigo == 4) {
			total = quantidade * 2.0;
		}
		else {
			total = quantidade * 1.5;
		}
		
		System.out.printf("Total a pagar: R$ %.2f%n", total);
		
		sc.close();
	}

}
