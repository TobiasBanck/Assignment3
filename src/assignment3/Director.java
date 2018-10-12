package assignment3;

public class Director extends Manager {
	double directorBenefit;
	private String department;// human resources, technical, or business
	
	public Director(String ID, String name, double salary, String degree, String department, double directorBenefit) {
		
		super(ID, name, salary, degree);
		this.directorBenefit = directorBenefit;
		
		this.department = department;
	}

	public double getNetSalary() {
		
		double netSalary = 0;
		if(this.getGrossSalary() < 30000) {
			
			netSalary = this.getGrossSalary() - (this.getGrossSalary() * TAX_RATE);
		} else if(this.getGrossSalary() < 50000) {
			
			netSalary = this.getGrossSalary() - (this.getGrossSalary() * (TAX_RATE * 2));
		} else {
			
			netSalary = this.getGrossSalary() - (30000 * (TAX_RATE * 2));
			netSalary -= (this.getGrossSalary() - 30000) * (TAX_RATE * 4);
		}
		
		return netSalary;
	}
	
	public double getGrossSalary() {
		
		double grossSalary = 0;
		
		grossSalary = super.getGrossSalary() + this.directorBenefit;
		
		return grossSalary;
	}
	
	public String getDepartment() {
		
		return this.department;
	}

}
