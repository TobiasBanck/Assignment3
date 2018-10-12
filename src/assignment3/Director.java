package assignment3;

public class Director extends Manager {
	double directorBenefit;
	private String department;// human resources, technical, or business
	
	public Director(String ID, String name, double salary, String degree, String department, double directorBenefit) {
		
		super(ID, name, salary, department);
		this.directorBenefit = directorBenefit;
		
		this.department = department;
	}

	public double getNetSalary() { // directorBenefit bestämms av företaget så vet inte riktigt hur vi gör med det
		
		double netSalary = 0;
		if(super.getGrossSalary() < 30000) {
			
			netSalary = super.getNetSalary() + directorBenefit;
		} else if(super.getGrossSalary() < 50000) {
			
			netSalary = (super.getGrossSalary() + directorBenefit) - (super.getGrossSalary() + directorBenefit) * (TAX_RATE * 2);
		} else {
			
			netSalary = (super.getGrossSalary() + directorBenefit) - 30000 * (TAX_RATE * 2);
			netSalary -= super.getGrossSalary() - 30000 * (TAX_RATE * 4);
		}
		
		return netSalary;
	}
	
	public String getDepartment() {
		
		return this.department;
	}

}
