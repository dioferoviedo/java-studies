import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, diferenca;
		
		
		System.out.println("Digite o primeiro valor: ");
		a = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = sc.nextInt();
		System.out.println("Digite o terceiro valor: ");
		c = sc.nextInt();
		System.out.println("Digite o quarto valor: ");
		d = sc.nextInt();
		
		diferenca = (a*b) + (c*d);
		
		System.out.printf("Diferença do produto do 1° pelo 2° e do 3° pelo 4° valor: %d", diferenca);
		
		sc.close();
	}

}
