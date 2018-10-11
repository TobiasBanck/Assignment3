package assignment3;

public class Manager extends Employee {
	
	private String degree; // BSc, MSc, or PhD
	private double bonus; // 0.1, 0.2, 0.35, for BSc, MSc, and PhD, respectively
	

	public Manager(String ID, String name, double salary, String degree) {
		
		super(ID, name, salary);
		
		this.degree = degree; // inte säker hur vi ska sätta bonus eftersom vi inte borde ha logik i constructor
	}
	
	public String getDegree() {
		
		return this.degree;
	}
	
	public void setDegree(String degree) {
		
		this.degree = degree;
	}
	
	public double getGrossSalary() {
		
		double total = super.getGrossSalary();
		total += total * bonus;
		
		return total;
	}

}
