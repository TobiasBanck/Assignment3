package assignment3;
public class CompanyMain {
    public static void main(String[] args) {

        ReusaxCorp deanckInc = new ReusaxCorp();

        final int REGISTER_EMPLOYEEE = 1;
        final int RETRIEVE_EMPLOYEE = 2;
        final int UPDATE_EMPLOYEE = 3;
        final int REMOVE_EMPLOYEE = 4;
        final int SHOW_GROSS_SALARY = 5;
        final int SHOW_NET_SALARY = 6;
        final int SHOW_EMPLOYEE_AMOUNT = 7;
        final int QUIT = 8;

        System.out.println("1) Register Employee");
        System.out.println("2) Retrieve Employee info");
        System.out.println("3) Update Employee info");
        System.out.println("4) Remove Employee");
        System.out.println("5) Show total gross salary cost");
        System.out.println("6) Show total net salary cost");
        System.out.println("7) Show amount of Employees");
        System.out.println("8) quit");

        int option;
        option = IO.nextInt("");
        do {
            String ID;
            String name;
            double grossSalary;
            switch(option) {
                case REGISTER_EMPLOYEEE:
                    ID = IO.nextLine("Enter ID");
                    name = IO.nextLine("Enter name");
                    grossSalary = IO.nextDouble("Enter gross salary");

                    System.out.println("What type of employee do you wish to register?");
                    System.out.println("1) Regular Employee");
                    System.out.println("2) Intern");
                    System.out.println("3) Manager");
                    System.out.println("4) Director");
                    int employeeType = IO.nextInt("");
                    switch (employeeType){
                        case 1:
                            deanckInc.registerEmployee(ID, name, grossSalary);
                            break;
                        case 2:
                            int GPA = IO.nextInt("Enter degree of Intern");
                            deanckInc.registerIntern(ID, name, grossSalary, GPA);
                            break;
                        case 3:
                            String degree = IO.nextLine("Enter managers degree");
                            deanckInc.registerManager(ID, name, grossSalary, degree);
                            break;
                        case 4:
                            String directorDegree = IO.nextLine("Enter directors degree");
                            String department = IO.nextLine("Enter department");
                            deanckInc.registerDirector(ID, name, grossSalary, directorDegree, department);
                            break;
                    }
                    break;
                case RETRIEVE_EMPLOYEE:
                    ID = IO.nextLine("Enter ID");
                    deanckInc.retrieveEmployee(ID);
                    break;
                case UPDATE_EMPLOYEE:
                    int updateOption;
                    ID = IO.nextLine("Enter ID");
                    System.out.println("what do you want to update?");
                    System.out.println("1) Name");
                    System.out.println("2) grossSalary");
                    updateOption = IO.nextInt("");
                    if (updateOption == 1){
                        String newName = IO.nextLine("Enter new name");
                        deanckInc.updateEmployeeName(ID, newName);
                    }
                    if (updateOption == 2){
                        double newSalary = IO.nextDouble("Enter new Salary");
                        deanckInc.updateEmployeeSalary(ID, newSalary);
                    }
                    break;
                case REMOVE_EMPLOYEE:
                    ID = IO.nextLine("Enter ID");
                    deanckInc.removeEmployee(ID);
                    break;
                case SHOW_GROSS_SALARY:
                    deanckInc.totalGrossSalary();
                    break;
                case SHOW_NET_SALARY:
                    deanckInc.totalNetSalary();
                    break;
                case SHOW_EMPLOYEE_AMOUNT:
                    deanckInc.amountOfEmployees();
                    break;
                case QUIT:
                    break;
            }
        } while (option !=8);


    }
}
