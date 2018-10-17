package assignment3;

public class Employee {
	
    private String ID;
    private String name;
    private double grossSalary;
    protected final double TAX_RATE = 0.1;

    public Employee(String ID, String name, double grossSalary) {
    	
        this.ID = ID;
        this.name = name;
        this.grossSalary = grossSalary;
    }
    
    public void setName(String name) {
    	
        this.name = name;
    }

    public void setGrossSalary(double grossSalary) {
    	
        this.grossSalary = grossSalary;
    }

    public String getID() {
    	
        return this.ID;
    }

    public String getName() {
    	
        return this.name;
    }

    public double getGrossSalary() {
    	
        return this.grossSalary;
    }
    
    public double getNetSalary() {
    	
        return this.grossSalary - (grossSalary*TAX_RATE);
    }
    
    public double getBaseSalary() {
    	
    	return this.grossSalary;
    }

    public boolean equals(Object object) {
    	
        if (object instanceof  Employee){
            Employee anotherEmployee = (Employee) object;
            return this.ID.equals(anotherEmployee.getID());
        }
        return false;
    }
    
    public String toString() {
    	String toString = this.name + " gross salary is of: " + getGrossSalary() + " per month";
        return toString;
    }
}
