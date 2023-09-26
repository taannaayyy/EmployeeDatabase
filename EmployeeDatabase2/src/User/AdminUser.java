package User;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import Cryptography.Cryptography;
import MVC.View;

public class AdminUser extends User implements InsertAndDeleteRows{
	
	private static String adminUsername="Tanay";
	private static String adminPassword="123";
	View view = new View();
	public AdminUser() {
		super(getAdminUsername(), getAdminPassword());
	}
	public static String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		AdminUser.adminPassword = adminPassword;
	}
	public static String getAdminUsername() {
		return adminUsername;
	}
	public static void setAdminUsername(String adminUsername) {
		AdminUser.adminUsername = adminUsername;
	}
	@Override
	public void deleteRow(int index) throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addRow(String name, String job, int salary) throws Exception {
		// TODO Auto-generated method stub
		
	}
	

	
	
}
