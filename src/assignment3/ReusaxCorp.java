package assignment3;

import java.util.ArrayList;

public class ReusaxCorp {

    private double directorsBenefit;
    private ArrayList<Employee> employees;

    public ReusaxCorp(double directorsBenefit) {
    	
        employees = new ArrayList<>();   // initializing employees arraylist
        this.directorsBenefit = directorsBenefit;
    }
    public void setDirectorsBenefit(double benefit) {
    	
        this.directorsBenefit = benefit;
    }
    public double getDirectorsBenefit() {
    	
        return this.directorsBenefit;
    }

    public void registerEmployee(String ID, String name, double grossSalary ) {
    	
        Employee newEmployee = new Employee(ID, name, grossSalary);
        employees.add(newEmployee);
    }
    
    public void registerManager(String ID, String name, double grossSalary, String degree) {

        Manager newManager = new Manager(ID, name, grossSalary, degree);
        employees.add(newManager);
    }
    
    public void registerDirector(String ID, String name, double grossSalary, String degree, String department) {
    	
        Director newDirector = new Director(ID, name, grossSalary, degree, department, this.directorsBenefit);
        employees.add(newDirector);
    }
    
    public void registerIntern(String ID, String name, double grossSalary, int GPA) {
    	
        Intern newIntern = new Intern(ID, name, grossSalary, GPA);
        employees.add(newIntern);
    }

    public Employee retrieveEmployee(String ID) {  //Checking if the String entered is equal to any employees ID
        
    	Employee equalEmployee = null;
        for (Employee employee: employees){
            if (ID.equals(employee.getID())){
                equalEmployee = employee;
            }
        }
        return equalEmployee;
    }

    public void removeEmployee(String ID) {
    	
        Employee employeeToremove = retrieveEmployee(ID);  //Reusing the retrieve method
        employees.remove(employeeToremove);
    }
    
    public void updateEmployeeName(String ID, String newName) {
    	
        Employee employeeToUpdate = retrieveEmployee(ID);     //Reusing the retrieve method
        employeeToUpdate.setName(newName);
    }
    
    public void updateEmployeeSalary (String ID, double newGrossSalary) {
    	
        Employee employeetoupdate = retrieveEmployee(ID);     //Reusing the retrieve method
        employeetoupdate.setGrossSalary(newGrossSalary);
    }
    
    public double totalGrossSalary() {
    	
        double totalcost = 0;
        for(Employee employee: employees){
            totalcost += employee.getGrossSalary();   //going through every employee and adding their gross salaries
        }
        return totalcost;
    }
    
    public double totalNetSalary() {
    	
        double totalcost = 0;
        for(Employee employee: employees){
            totalcost += employee.getNetSalary();     //going through every employee and adding their net salaries
        }
        return totalcost;
    }
    
    public int amountOfEmployees() {
    	
        return employees.size();
    }
    
    public void promoteToManager(String ID, String degree) {
    	
    	Employee employeeToPromote = retrieveEmployee(ID);
    	
    	registerManager(ID, employeeToPromote.getName(), employeeToPromote.getGrossSalary(), degree);
    	
    	employees.remove(employeeToPromote);
    }
    
    public void promoteToDirector(String ID, String degree, String department) {
    	
    	Employee employeeToPromote = retrieveEmployee(ID);
    	
    	registerDirector(ID, employeeToPromote.getName(), employeeToPromote.getGrossSalary(), degree, department);
    	
    	employees.remove(employeeToPromote);
    }
    
    public void promoteToIntern(String ID, int gpa) {
    	
		Employee employeeToPromote = retrieveEmployee(ID);
    	
    	registerIntern(ID, employeeToPromote.getName(), employeeToPromote.getGrossSalary(), gpa);
    	
    	employees.remove(employeeToPromote);
    }
    
    public void promoteToEmployee(String ID) {
    	
    	Employee employeeToPromote = retrieveEmployee(ID);
    	
    	registerEmployee(ID, employeeToPromote.getName(), employeeToPromote.getGrossSalary());
    	
    	employees.remove(employeeToPromote);
    }
}
