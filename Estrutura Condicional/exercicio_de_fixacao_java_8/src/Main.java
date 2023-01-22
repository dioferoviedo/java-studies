import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double jurosoito, jurosdezoito, jurosvinteoito;
		
		
		System.out.println("Digite seu salário: ");
		double salario = sc.nextDouble();
		
		if (salario <= 2000.00 || salario <= 3000.0) {
			jurosoito = (salario - 2000.0) * 0.08;
			System.out.println("Isento.");
		}
		else if (salario >= 3000.01) {
			jurosdezoito = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
			System.out.printf("Imposto a pagar: R$ %.2f%n", jurosdezoito);			
		}
		else if (salario <= 4500.00) {
			jurosvinteoito = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
			System.out.printf("Imposto a pagar: R$ %.2f%n", jurosvinteoito);
		}
		else {
			System.out.println("Isento.");
		}
		
		sc.close();
}}
