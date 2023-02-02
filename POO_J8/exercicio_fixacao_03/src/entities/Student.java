package entities;

public class Student {

	public String name;
	public double grad1;
	public double grad2;
	public double grad3;

	
	
	public double finalGrade () {
		return grad1 + grad2 + grad3;
	}
	
	public double missingPoints () {
		if (finalGrade() < 60.0) {
			return 60.0 - finalGrade();
		}
		else {
			return 0.0;
		}
	}
	
	
	
}
