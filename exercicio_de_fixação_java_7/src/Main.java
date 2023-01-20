import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		double tri, cir, tra, qua, ret, pi;
		
		
		System.out.println("Lado A: ");
		A = sc.nextDouble();
		System.out.println("Lado B: ");
		B = sc.nextDouble();
		System.out.println("Lado C: ");
		C = sc.nextDouble();
		sc.nextLine();
			
			pi = 3.14159;
			tri = (C * A)/2;
			cir = Math.pow(C, 2)*pi;
			tra = ((A + B)*C)/2;
			qua = Math.pow(B, 2);
			ret = B*A;
		
		System.out.printf("TRIÂNGULO: %.3f%n", tri);
		System.out.printf("CÍRCULO: %.3f%n", cir);
		System.out.printf("TRAPÉZIO: %.3f%n", tra);
		System.out.printf("QUADRADO: %.3f%n", qua);
		System.out.printf("RETÂNGULO: %.3f%n", ret);
		
		
		sc.close();
		
	}

}
