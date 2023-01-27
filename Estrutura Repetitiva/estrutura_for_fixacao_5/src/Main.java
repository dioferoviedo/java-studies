import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		
		int fatN = 1;
		for (int i=1; i<N; i++) {
				fatN = fatN * i;
	}
		System.out.println(fatN);
		
		sc.close();
		

}}
