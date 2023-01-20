import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int id, hr;
		double salary, hrtb;
		
		System.out.println("Qual seu ID? ");
		id = sc.nextInt();
		System.out.println("Digite a quantia de horas trabalhadas:");
		hr = sc.nextInt();
		System.out.println("Valor ganho por hora trabalhada:");
		hrtb = sc.nextDouble();
		
		salary = hrtb * hr;
		
		System.out.printf("ID: %d%nReceberá um salário na quantia de $ %.2f", id, salary);
		
		sc.close();
		
		
	}

}
