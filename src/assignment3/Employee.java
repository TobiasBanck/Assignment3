package assignment3;

public class Employee {
    private String ID;
    private String name;
    private double grossSalary;
    private final double TAX_RATE = 0*1;

    public Employee(String ID, String name, double grossSalary){
        this.ID = ID;
        this.name = name;
        this.grossSalary = grossSalary;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setGrossSalary(double grossSalary){
        this.grossSalary = grossSalary;
    }

    public String getID() {
        return this.ID;
    }

    public String getName(){
        return this.ID;
    }

    public double getGrossSalary(){
        return this.grossSalary;
    }
    public double getNetSalary(){
        return this.grossSalary - (grossSalary*TAX_RATE);
    }

    public boolean equals(Object object){
        if (object instanceof  Employee){
            Employee anotherEmployee = (Employee) object;
            return this.ID.equals(anotherEmployee.getID());
        }
        return false;
    }
    public String toString(){
        return this.name + " gross salary is of: " + grossSalary + " per month";
    }




}
