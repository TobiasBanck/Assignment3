package assignment3;

public class Manager extends Employee {
	
	private String degree; // BSc, MSc, or PhD
	private double bonus; // 0.1, 0.2, 0.35, for BSc, MSc, and PhD, respectively
	

	public Manager(String ID, String name, double salary, String degree) {
		
		super(ID, name, salary);
		
		this.degree = degree;
	}
	
	public String getDegree() {
		
		return this.degree;
	}
	
	public void setDegree(String degree) {
		
		this.degree = degree;
	}
	
	public double getGrossSalary() {
		if (this.degree.equals("MSc")){
			this.bonus = 0.2;
		}
		else if(this.degree.equals("PhD")){
			this.bonus = 0.35;
		}
		else if(this.degree.equals("BSc")){
			this.bonus = 0.1;
		}
		
		double total = super.getGrossSalary();
		total += total * bonus;
		
		return total;
	}
	
	public double getNetSalary() {

		return (this.getGrossSalary() - (this.getGrossSalary() * TAX_RATE));
		
	}
}
