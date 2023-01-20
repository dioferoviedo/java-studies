import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int id1, id2, pcs1, pcs2;
		double vunit1, vunit2, total;
		
		System.out.println("Digite o ID da 1° peça:");
		id1 = sc.nextInt();
		System.out.println("Digite o ID da 2° peça:");
		id2 = sc.nextInt();
		
		System.out.println("Insira a quantidade da 1° peça desejada:");
		pcs1 = sc.nextInt();
		System.out.println("Insira a quantidade da 2° peça desejada:");
		pcs2 = sc.nextInt();
		
		vunit1 = 5.10;
		vunit2 = 5.30;
		total = (pcs1 * vunit1) + (pcs2 * vunit2);
		
		System.out.printf("Peça ID %d : $ %.2f%n", id1, vunit1);
		System.out.printf("Peça ID %d : $ %.2f%n", id2, vunit2);
		System.out.printf("Valor total a pagar: $ %.2f%n", total);
		
		sc.close();
		
	}

}
