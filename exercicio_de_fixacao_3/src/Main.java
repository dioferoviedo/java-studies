import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

	
	double area, raio, pi;
	
	System.out.println("Escreva o raio do círculo: ");
	raio = sc.nextDouble();
	pi = 3.14159;
	area = Math.pow(raio, 2) * pi;
	System.out.printf("O valor da área do círculo é: %.4f", area);
	
		sc.close();	
	
	}

}
