import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		
		System.out.println("Insira o tipo de combústivel: ");
		int tipo = sc.nextInt();
		
		while (tipo != 4) {
			if (tipo == 1) {
					alcool = alcool + 1;
			}
			else if (tipo == 2) {
					gasolina = gasolina + 1;
			}
			else if (tipo == 3) {
					diesel = diesel + 1;
			}
		
			tipo = sc.nextInt();
		
		}
		
		System.out.println("Muito obrigado!");
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();

}}
