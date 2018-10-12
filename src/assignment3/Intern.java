package assignment3;

public class Intern extends Employee {
	
	private int gpa; // 0-10

	public Intern(String ID, String name, double salary, int gpa) {
		
		super(ID, name, salary);
		
		this.gpa = gpa;
	}
	
	public void setGpa(int gpa) {
		
		this.gpa = gpa;
	}
	
	public double getGrossSalary() {
		
		double salary = 0;
		if(this.gpa <= 5) {
			
			return 0;
		}
		// if the gpa is higher than 5 they will always get at least their full salary
		salary = super.getGrossSalary();
		
		if(gpa >= 8) {
			
			salary += 1000;
		}
		
		return salary;
	}
	
	public double getNetSalary() {
		
		return getGrossSalary();
	}

}
