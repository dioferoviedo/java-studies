import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de x:");
		double x = sc.nextDouble();
		System.out.println("Digite o valor de y:");
		double y = sc.nextDouble();
		
		if (x == 0.0 && y == 0.0 ) {
			System.out.println("Origem.");
		}
		else if (x == 0) {
			System.out.println("Eixo X.");
		}
		else if (y == 0) {
			System.out.println("Eixo Y.");
		}
		else if (x > 0.0 && y > 0.0) {
			System.out.println("Primeiro quadrante.");
		}
		else if (x < 0.0 && y > 0.0) {
			System.out.println("Segundo quadrante.");
		}
		else if( x < 0.0 && y < 0.0) {
			System.out.println("Terceiro quadrante.");
		}
		else {
			System.out.println("Quarto quadrante.");
		}
		sc.close();
	}

}
