package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle re = new Rectangle ();
		
		System.out.println("Enter rectangle width and height");
		re.a = sc.nextDouble();
		re.b = sc.nextDouble();

		System.out.printf("Area: %.2f%n ", re.area());
		System.out.printf("Perimeter: %.2f%n ", re.perimeter());
		System.out.printf("Diagonal: %.2f%n ", re.diagonal());

		
		sc.close();
	}

}