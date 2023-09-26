package MVC;

import java.io.FileNotFoundException;

public class Main {
	public static void main (String [] args) throws FileNotFoundException,Exception {
		
		Controller cont = new Controller();
		cont.getView().openLoginPage();
		
		cont.getView().getEmployeeInfo().setText(cont.getModel().getEmployeeName()+" "+cont.getModel().getEmployeeJob()+" "+cont.getModel().getEmployeeSalary());
		cont.getModel().addRow("Ozan", "student", "3000");
		
		
	}
}
