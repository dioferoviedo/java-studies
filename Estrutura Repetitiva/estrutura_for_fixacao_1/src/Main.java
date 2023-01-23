import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for (int i=1; i<=x; i= i+2) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
	}
		
		sc.close();

}}
