package assignment3;

public class CompanyMain {

	private final int REGISTER_EMPLOYEEE = 1;
	private final int RETRIEVE_EMPLOYEE = 2;
	private final int UPDATE_EMPLOYEE = 3;
	private final int REMOVE_EMPLOYEE = 4;
	private final int SHOW_GROSS_SALARY = 5;
	private final int SHOW_NET_SALARY = 6;
	private final int SHOW_EMPLOYEE_AMOUNT = 7;
	private final int PROMOTE_EMPLOYEE = 8;
	private final int PRINT_ALL_EMPLOYEES = 9;
	private final int QUIT = 10;

	public CompanyMain() {

	}

	public void run() {

		ReusaxCorp deanckInc = new ReusaxCorp();

		int option;
		do {
			System.out.println("1) Register Employee");
			System.out.println("2) Retrieve Employee info");
			System.out.println("3) Update Employee info");
			System.out.println("4) Remove Employee");
			System.out.println("5) Show total gross salary cost");
			System.out.println("6) Show total net salary cost");
			System.out.println("7) Show amount of Employees");
			System.out.println("8) Promote Employee");
			System.out.println("9) print all employees");
			System.out.println("10) quit");
			
			String ID;
			String name;
			double grossSalary;

			option = IO.nextInt("");
			switch (option) {
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
				switch (employeeType) {
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
				Employee retreivedEmployee = deanckInc.retrieveEmployee(ID);
				if (retreivedEmployee == null) {
					System.out.println("No employee of ID " + ID + " found");
				} else {
					System.out.println(retreivedEmployee);
				}
				break;
			case UPDATE_EMPLOYEE:
				int updateOption;
				ID = IO.nextLine("Enter ID");
				System.out.println("what do you want to update?");
				System.out.println("1) Name");
				System.out.println("2) grossSalary");
				updateOption = IO.nextInt("");
				if (updateOption == 1) {
					String newName = IO.nextLine("Enter new name");
					deanckInc.updateEmployeeName(ID, newName);
				}
				if (updateOption == 2) {
					double newSalary = IO.nextDouble("Enter new Salary");
					deanckInc.updateEmployeeSalary(ID, newSalary);
				}
				break;
			case REMOVE_EMPLOYEE:
				ID = IO.nextLine("Enter ID");
				Employee employeeToRemove = deanckInc.retrieveEmployee(ID);
				if (employeeToRemove == null) {
					System.out.println("No employee of ID " + ID + " found");
				} else {
					deanckInc.removeEmployee(ID);
				}
				break;
			case SHOW_GROSS_SALARY:
				System.out.println(deanckInc.totalGrossSalary());
				break;
			case SHOW_NET_SALARY:
				System.out.println(deanckInc.totalNetSalary());
				break;
			case SHOW_EMPLOYEE_AMOUNT:
				System.out.println("There are " + deanckInc.amountOfEmployees() + " employees");
				break;
			case PROMOTE_EMPLOYEE:
				ID = IO.nextLine("Enter ID");
				System.out.println("what do you want to promote to?");
				System.out.println("1) Regular employee");
				System.out.println("2) Intern");
				System.out.println("3) Manager");
				System.out.println("4) Director");

				int promotionType = IO.nextInt("");
				int GPA;
				String degree;
				String department;

				switch (promotionType) {
				case 1:
					deanckInc.promoteToEmployee(ID);
					break;
				case 2:
					GPA = IO.nextInt("Enter GPA");
					deanckInc.promoteToIntern(ID, GPA);
					break;
				case 3:
					degree = IO.nextLine("Enter degree");
					deanckInc.promoteToManager(ID, degree);
					break;
				case 4:
					degree = IO.nextLine("Enter degree");
					department = IO.nextLine("Enter Department");
					deanckInc.promoteToDirector(ID, degree, department);
					break;
				}

			case QUIT:
				break;
				
			case PRINT_ALL_EMPLOYEES:
				System.out.println(deanckInc.getAllEmployees());
			}
		} while (option != QUIT);
	}

	public static void main(String[] args) {

		CompanyMain main = new CompanyMain();
		main.run();
	}
}
