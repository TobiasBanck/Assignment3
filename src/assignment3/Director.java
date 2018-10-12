package assignment3;

public class Director extends Manager {
	double directorBenefit;
	private String department;// human resources, technical, or business
	private final int LOWER_TAX_BRACKET = 30000;
	private final int UPPER_TAX_BRACKET = 50000;
	private final double TAX_RATE_FOR_LOWER_BRACKET = 0.2;
	private final double TAX_RATE_FOR_UPPER_BRACKET = 0.4;
	
	public Director(String ID, String name, double salary, String degree, String department, double directorBenefit) {
		
		super(ID, name, salary, degree);
		this.directorBenefit = directorBenefit;
		
		this.department = department;
	}

	public double getNetSalary() {
		
		double netSalary = 0;
		if(this.getGrossSalary() < LOWER_TAX_BRACKET) {
			
			netSalary = this.getGrossSalary() - (this.getGrossSalary() * TAX_RATE);
		} else if(this.getGrossSalary() < UPPER_TAX_BRACKET) {
			
			netSalary = this.getGrossSalary() - (this.getGrossSalary() * TAX_RATE_FOR_LOWER_BRACKET);
		} else {
			
			netSalary = this.getGrossSalary() - (LOWER_TAX_BRACKET * TAX_RATE_FOR_LOWER_BRACKET);
			netSalary -= (this.getGrossSalary() - LOWER_TAX_BRACKET) * TAX_RATE_FOR_UPPER_BRACKET;
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
