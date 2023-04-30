package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		
		
		System.out.println("Name: ");
		st.name = sc.nextLine();
		
		System.out.println("Grade: ");
		st.grad1 = sc.nextDouble();
		st.grad2 = sc.nextDouble();
		st.grad3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", st.finalGrade());
		
		if (st.finalGrade() < 60.0) {
			System.out.println("FAILED.");
			System.out.printf("Missing points: %.2f%n", st.missingPoints());
		}
		else {
			System.out.println("PASS.");
		}
		
		sc.close();
	}

}
