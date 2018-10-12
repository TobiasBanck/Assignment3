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
		if (degree.equals("MSc")){
			this.bonus = 0.2;
		}
		else if(degree.equals("PhD")){
			this.bonus = 0.35;
		}
		else{
			this.bonus = 0.1;       //Assuming every manager at least has a BSc, in case of spelling errors
		}
		
		double total = super.getGrossSalary();
		total += total * bonus;
		
		return total;
	}


}
