package User;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import Cryptography.Cryptography;
import MVC.View;

public class EmployerUser extends User implements InsertAndDeleteRows{
	private static String employerUsername="Simay";
	private static String employerPassword="123456";
	private View view = new View();
	private File file = new File ("C:\\Users\\Tanay\\Desktop\\Database2.txt");
	public EmployerUser(String employerUsername,String employerPassword) {
		super(employerUsername,employerPassword);
		EmployerUser.employerUsername=employerUsername;
		EmployerUser.employerPassword=employerPassword;
	}
	public static String getEmployerUsername() {
		return employerUsername;
	}
	public static void setEmployerUsername(String employerUsername) {
		EmployerUser.employerUsername = employerUsername;
	}
	public static String getEmployerPassword() {
		return employerPassword;
	}
	public static void setEmployerPassword(String employerPassword) {
		EmployerUser.employerPassword = employerPassword;
	}
	@Override
	public void deleteRow(int index) {
		
	}
	public String encrypt(String aaa) throws Exception {
		return Cryptography.encrypt(aaa, Cryptography.generateSecretKey());
	}
	public String decrypt(String aaa) throws Exception {
		return Cryptography.decrypt(aaa, Cryptography.generateSecretKey());
	}
	private void encryptAndPrint(String name,String job,int salary) throws Exception{
		String temp = "";
		try {
			PrintStream print = new PrintStream(file);
			Scanner scan = new Scanner (file);
			while (scan.hasNextLine()) {
				for(int i = 0 ; i <3; i++) {
					temp = temp+scan.nextLine()+" ";
				}
				temp = temp+"\n";
			}
			
			print.print(temp+encrypt(name)+" "+encrypt(job)+" "+encrypt(Integer.toString(salary)));
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	private String decryptToString() throws Exception {
		Scanner scan = new Scanner (file);
		String temp2 = "";
		while (scan.hasNextLine()) {
			for(int i=0;i<3;i++) {
				temp2=temp2+decrypt(scan.nextLine())+" ";
			}
			temp2=temp2+"\n";
		}
		scan.close();
		return temp2;
	}
	@Override
	public void addRow(String name,String job,int salary) throws Exception {
		encryptAndPrint(name,job,salary);
		view.getDataTable().setText(decryptToString());
	}
	
	
}
