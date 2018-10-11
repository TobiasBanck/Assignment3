package assignment3;

import java.util.ArrayList;

public class ReusaxCorp {
    ArrayList<Employee> employees;

    public ReusaxCorp(){
        employees = new ArrayList<>();   // initializing employees arraylist
    }

    public void registerEmployee(String ID, String name, double grossSalary ){
        Employee newEmployee = new Employee(ID, name, grossSalary);
        employees.add(newEmployee);
    }
    public void registerManager(String ID, String name, double grossSalary, String degree){
        Manager newManager = new Manager(ID, name, grossSalary, degree);
        employees.add(newManager);

    }
    public void registerDirector(String ID, String name, double grossSalary, String degree, String department){
        Director newDirector = new Director(ID, name, grossSalary, degree, department);
        employees.add(newDirector);
    }
    public void registerIntern(String ID, String name, double grossSalary, int GPA){
        Intern newIntern = new Intern(ID, name, grossSalary, GPA);
        employees.add(newIntern);
    }

    public Employee retrieveEmployee(String ID){  //Checking if the String entered is equal to any employees ID
        Employee equalEmployee = null;
        for (Employee employee: employees){
            if (ID.equals(employee.getID())){
                equalEmployee = employee;
            }
        }
        return equalEmployee;
    }

    public void removeEmployee(String ID){
        Employee employeeToremove = retrieveEmployee(ID);  //Reusing the retrieve method
        employees.remove(employeeToremove);
    }
    public void updateEmployeeName(String ID, String newName){
        Employee employeeToUpdate = retrieveEmployee(ID);     //Reusing the retrieve method
        employeeToUpdate.setName(newName);
    }
    public void updateEmployeeSalary (String ID, double newGrossSalary){
        Employee employeetoupdate = retrieveEmployee(ID);     //Reusing the retrieve method
        employeetoupdate.setGrossSalary(newGrossSalary);
    }
    public double totalGrossSalary(){
        double totalcost = 0;
        for(Employee employee: employees){
            totalcost += employee.getGrossSalary();   //going through every employee and adding their gross salaries
        }
        return totalcost;
    }
    public double totalNetSalary(){
        double totalcost = 0;
        for(Employee employee: employees){
            totalcost += employee.getNetSalary();     //going through every employee and adding their net salaries
        }
        return totalcost;
    }
    public int amountOfEmployees(){
        return employees.size();
    }

}
