package assignment3;

import java.util.ArrayList;

public class ReusaxCorp {
    ArrayList<Employee> employees;

    public ReusaxCorp(){
        employees = new ArrayList<>();
    }

    public void registerEmployee(String ID, String name, double grossSalary ){
        Employee newEmployee = new Employee(ID, name, grossSalary);
        employees.add(newEmployee);
    }
    public Employee retrieveEmployee(String ID){
        Employee equalEmployee = null;
        for (Employee employee: employees){
            if (ID.equals(employee.getID())){
                equalEmployee = employee;
            }
        }
        return equalEmployee;
    }

    public void removeEmployee(String ID){
        Employee employeeToremove = retrieveEmployee(ID);
        employees.remove(employeeToremove);
    }
    public void updateEmployeeName(String ID, String newName){
        Employee employeeToUpdate = retrieveEmployee(ID);
        employeeToUpdate.setName(newName);
    }
    public void updateEmployeeSalary (String ID, double newGrossSalary){
        Employee employeetoupdate = retrieveEmployee(ID);
        employeetoupdate.setGrossSalary(newGrossSalary);
    }
    public double totalGrossSalary(){
        double totalcost = 0;
        for(Employee employee: employees){
            totalcost += employee.getGrossSalary();
        }
        return totalcost;
    }
    public double totalNetSalary(){
        double totalcost = 0;
        for(Employee employee: employees){
            totalcost += employee.getNetSalary();
        }
        return totalcost;
    }
    public int amountOfEmployees(){
        return employees.size();
    }





}
