package User;

public class EmployeeUser extends User{
	private static String employeeUsername="Ozan";
	private static String employeePassword="1234";
	private static String employeeName="Ozan";
	private static String employeeJob="student";
	private static int employeeSalary=3000;
	
	public EmployeeUser(String employeeUsername,String employeePassword,String employeeName,String employeeJob,int employeeSalary) {
		super(employeeUsername, employeePassword);
		this.setEmployeeUsername(employeeUsername);
		this.setEmployeePassword(employeePassword);
		this.setEmployeeName(employeeName);
		this.setEmployeeJob(employeeJob);
		this.setEmployeeSalary(employeeSalary);
	}
	
	public static String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeUser.employeeName = employeeName;
	}
	public static String getEmployeeJob() {
		return employeeJob;
	}
	public void setEmployeeJob(String employeeJob) {
		EmployeeUser.employeeJob = employeeJob;
	}
	public static int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		EmployeeUser.employeeSalary = employeeSalary;
	}

	public static String getEmployeeUsername() {
		return employeeUsername;
	}

	public void setEmployeeUsername(String employeeUsername) {
		EmployeeUser.employeeUsername = employeeUsername;
	}

	public static String getEmployeePassword() {
		return employeePassword;
	}

	public void setEmployeePassword(String employeePassword) {
		EmployeeUser.employeePassword = employeePassword;
	}

}
