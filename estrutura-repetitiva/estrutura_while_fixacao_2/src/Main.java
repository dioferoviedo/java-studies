import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
			System.out.println("primeiro quadrante.");
	}
			else if (x < 0 && y > 0) {
				System.out.println("segundo quadrante");
			}
			else if (x < 0 && y < 0) {
				System.out.println("terceiro quadrante");
			}
			else {
				System.out.println("quarto quadrante");
			}
			x = sc.nextInt();
			y = sc.nextInt();
}
		sc.close();
		}}
	
