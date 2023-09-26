package MVC;
import Cryptography.Cryptography;
import User.AdminUser;
import User.EmployeeUser;
import User.EmployerUser;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Model {
	View view = new View();
	
	public Model() throws Exception{
		hashAndPrintPasswords();
		
	}
	private static EmployeeUser employee = new EmployeeUser(EmployeeUser.getEmployeeUsername(),EmployeeUser.getEmployeePassword(),EmployeeUser.getEmployeeName(),EmployeeUser.getEmployeeJob(),EmployeeUser.getEmployeeSalary());
	private static String employeeUsername=employee.getUsername();
	private static String employeePassword=employee.getPassword();
	private static String employeeName=EmployeeUser.getEmployeeName();
	private static String employeeJob=EmployeeUser.getEmployeeJob();
	private static int employeeSalary=EmployeeUser.getEmployeeSalary();
	public String getEmployeePassword() {
		return employeePassword;
	}
	public String getEmployeeUsername() {
		return employeeUsername;
	}
	
	private static EmployerUser employer =new EmployerUser(EmployerUser.getEmployerUsername(),EmployerUser.getEmployerPassword());
	private static String employerUsarname="Simay";
	private static String employerPassword = "123456";
	
	public String getEmployerUsername() {
		return employerUsarname;
	}
	public String getEmployerPassword() {
		return employerPassword;
	}
	
	private AdminUser admin = new AdminUser();
	
	private static String adminUsername= AdminUser.getAdminUsername();
	private static String adminPassword = AdminUser.getAdminPassword();	
	public String getAdminUsername() {
		return adminUsername;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	
	public String encrypt2(String aaa) throws Exception {
		return Cryptography.encrypt(aaa, Cryptography.generateSecretKey());
	}
	public String decrypt2(String aaa) throws Exception {
		return Cryptography.decrypt(aaa, Cryptography.generateSecretKey());
	}
	public String Hash(String x) throws Exception{
		return Cryptography.getHash(x);
	}
	
	public void hashAndPrintPasswords() throws FileNotFoundException {
		FileOutputStream file = new FileOutputStream ("C:\\Users\\Tanay\\Desktop\\LoginDatas.txt");
		PrintStream print = new PrintStream(file);
		try {
			print.println(encrypt(AdminUser.getAdminUsername())+"\n"+Hash(AdminUser.getAdminPassword()));
			print.println(encrypt(EmployerUser.getEmployerUsername())+"\n"+Hash(EmployerUser.getEmployerPassword()));
			print.println(encrypt(EmployeeUser.getEmployeeUsername())+"\n"+Hash(EmployeeUser.getEmployeePassword()));
			print.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	
	
	
	public String getEmployeeName() {
		return employeeName;
	}
	public String getEmployeeJob() {
		return employeeJob;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public static EmployerUser getEmployer() {
		return employer;
	}
	public AdminUser getAdmin() {
		return admin;
	}
	
	static File file = new File("C:\\Users\\Tanay\\Desktop\\Database2.txt");

	public static String encrypt(String aaa) throws Exception {
		return Cryptography.encrypt(aaa, Cryptography.generateSecretKey());
	}
	public String decrypt(String aaa) throws Exception {
		return Cryptography.decrypt(aaa, Cryptography.generateSecretKey());
	}
	static ArrayList<String> arr = new ArrayList<String>();
	private static void addToArray(String name,String job,String salary) {
		arr.add(name+" "+job+" "+salary);
	}
	private static String encrypt() throws Exception {
		String x ="";
		for(int i = 0 ; i<arr.size();i++) {
			x = x+encrypt(arr.get(i))+"\n";
		}
		return x;
	}
	private static void print() throws Exception {
		PrintStream print = new PrintStream(file);
		print.print(encrypt());
	}
	private static String read() throws FileNotFoundException {
		Scanner scan = new Scanner (file);
		String x ="";
		while (scan.hasNextLine()) {
			x=x+scan.nextLine();
			x=x+"\n";
		}
		return x;
	}
	private static String decrypt() {
		String x ="";
		for(int i = 0 ; i<arr.size();i++) { 
			x=x+arr.get(i)+"\n";
		}
		return x;
	}
	
	public void addRow(String name,String job,String salary) throws Exception {
		addToArray(name,job,salary);
		print();
		view.getDataTable().setText(decrypt());
	}
	
	public void fire(int index) {
		arr.remove(index);
		
	}
	public void deleteRow(int index) throws Exception {
		fire(index);
		print(); 
		view.getDataTable().setText(decrypt());
	}
	public void edit(String name,String job,String salary,int index) {
		String a = name+" "+job+" "+salary;
		arr.set(index, a);
		view.getDataTable().setText(decrypt());
	}
	public void raiseSalary(int index,String salary) throws Exception {
		String ınfo = arr.get(index);
		String[] parts = ınfo.split(" ");
		String name = parts[0];
		String job = parts[1];
		String a = name+" "+job+" "+salary;
		arr.set(index, a);
		print();
		view.getDataTable().setText(decrypt());
	}
	
	
	
}	
 