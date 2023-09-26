package MVC;
import javax.swing.*;
import java.awt.*;
public class View  extends JFrame{
	
	//properties of Login Page 
	private static JFrame loginFrame = new JFrame("Sign in");
	private static JLabel loginLabel = new JLabel ("Sign in");
	private static JLabel usernameLabel = new JLabel("User Name");
	private static JLabel passwordLabel = new JLabel("Password");
	private static JTextField usernameTextField = new JTextField();
	private static JPasswordField passwordTextField = new JPasswordField();
	private static JButton loginButton = new JButton("Sign in");
	private static JButton exitButton = new JButton("Exit");
	//getters of Login Page
	public JButton getLoginButton() {
		return loginButton;
	}
	public JButton getExitButton() {
		return exitButton;
	}
	public JFrame getLoginFrame() {
		return loginFrame;
	}	
	public JTextField getUsernameTextField() {
		return usernameTextField;
	}
	public JTextField getPasswordTextField() {
		return passwordTextField;
	}
	//Open Login Page method
	public void openLoginPage() throws Exception{
			loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			loginFrame.setSize(600,500);
			loginFrame.setResizable(false);
			//Top Panel
			JPanel topPanel = new JPanel();	
			topPanel.setBounds(0,0,586,30);
			topPanel.setLayout(new BorderLayout());
			loginFrame.add(topPanel);
			
			
				//Login Label
				topPanel.add(loginLabel,BorderLayout.WEST);
			
			//Main Panel
			JPanel mainPanel = new JPanel ();
			loginFrame.add(mainPanel);
			mainPanel.setBounds(0,30,300,230);
			mainPanel.setLayout(null);
					
				//Labels
				usernameLabel.setBounds(125,225,85,25);
				mainPanel.add(usernameLabel);
				
				passwordLabel.setBounds(125,250,85,25);
				mainPanel.add(passwordLabel);
	
				//TextFields
				usernameTextField.setBounds(200,230,170,20);
				mainPanel.add(usernameTextField);
						
				passwordTextField.setBounds(200,250,170,20);
				mainPanel.add(passwordTextField);
			
				//buttons
				
				mainPanel.add(loginButton);
				loginButton.setBounds(200,300,85,25);
				loginButton.addActionListener(new Controller());
				
				mainPanel.add(exitButton);
				exitButton.setBounds(285,300,85,25);
				exitButton.addActionListener(new Controller());
				
				
			loginFrame.setVisible(true);
		}	
	
	//properties of Employer Page
	private static JFrame employerFrame = new JFrame("Employer Page");
	private static JButton showDatabaseEmployer = new JButton ("Show Database");
	private static JButton hireEmployee = new JButton ("Hire Employee");
	private static JButton fireEmployee = new JButton ("Fire Employee");
	private static JButton raiseSalary = new JButton ("Raise Salary");
	private static JButton exitPage = new JButton ("Exit");
	private static JTextField nameTextField = new JTextField();
	private static JTextField jobTextField = new JTextField();
	private static JTextField salaryTextField = new JTextField();
	private static JTextField ındexTextField = new JTextField();
	private static JTextField ındexTextField2 = new JTextField();
	private static JTextField salaryTextField2 = new JTextField();	
	private static JLabel nameLabel = new JLabel("Name");
	private static JLabel jobLabel = new JLabel("Job");
	private static JLabel salaryLabel = new JLabel("Salary");
	private static JLabel ındexLabel = new JLabel("Index");
	private static JLabel ındexLabel2 = new JLabel("Index");
	private static JLabel salaryLabel2 = new JLabel("Salary");
	//getters of Employer Page
	public JFrame getEmployerFrame() {
		return employerFrame;
	}
	public JButton getShowDatabaseEmployer() {
		return showDatabaseEmployer;
	}
	public static JButton getHireEmployee() {
		return hireEmployee;
	}
	public static JButton getFireEmployee() {
		return fireEmployee;
	}
	public static JButton getRaiseSalary() {
		return raiseSalary;
	}
	public JButton getExitEmployerPage() {
		return exitPage;
	}
	public static JTextField getNameTextField() {
		return nameTextField;
	}
	public static JTextField getJobTextField() {
		return jobTextField;
	}
	public static JTextField getSalaryTextField() {
		return salaryTextField;
	}
	public static JTextField getIndexTextField() {
		return ındexTextField;
	}
	public static JTextField getIndexTextField2() {
		return ındexTextField2;
	}
	public static JTextField getSalaryTextField2() {
		return salaryTextField2;
	}
	//Open Employer Page method
	public void openEmployerPage() throws Exception {
			employerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			employerFrame.setSize(650,450);
			
			//Main Panel
			JPanel employermainPanel = new JPanel();
			employerFrame.add(employermainPanel);
			employermainPanel.setBounds(0,30,300,230);
			employermainPanel.setLayout(null);
			
				//Buttons
				showDatabaseEmployer.setBounds(175,100,300,25);
				employermainPanel.add(showDatabaseEmployer);
				showDatabaseEmployer.addActionListener(new Controller());
				
				hireEmployee.setBounds(350,150,125,25);
				employermainPanel.add(hireEmployee);
				hireEmployee.addActionListener(new Controller());
				
				fireEmployee.setBounds(350,200,125,25);
				employermainPanel.add(fireEmployee);
				fireEmployee.addActionListener(new Controller());

				raiseSalary.setBounds(350,250,125,25);
				employermainPanel.add(raiseSalary);
				raiseSalary.addActionListener(new Controller());
				
				exitPage.setBounds(175,300,300,25);
				employermainPanel.add(exitPage);
				exitPage.addActionListener(new Controller());
				
				//Text Fields
				nameTextField.setBounds(175,150,75,25);
				employermainPanel.add(nameTextField);
				
				jobTextField.setBounds(250,150,50,25);
				employermainPanel.add(jobTextField);
				
				salaryTextField.setBounds(300,150,50,25);
				employermainPanel.add(salaryTextField);
				
				ındexTextField.setBounds(175,200,175,25);
				employermainPanel.add(ındexTextField);
				
				ındexTextField2.setBounds(175,250,100,25);
				employermainPanel.add(ındexTextField2);

				salaryTextField2.setBounds(275,250,75,25);
				employermainPanel.add(salaryTextField2);
				
				//Labels
				
				nameLabel.setBounds(175,125,75,25);
				employermainPanel.add(nameLabel);
				
				jobLabel.setBounds(260,125,75,25);
				employermainPanel.add(jobLabel);
				
				salaryLabel.setBounds(305,125,75,25);
				employermainPanel.add(salaryLabel);
				
				ındexLabel.setBounds(175,175,75,25);
				employermainPanel.add(ındexLabel);
				
				ındexLabel2.setBounds(175,225,75,25);
				employermainPanel.add(ındexLabel2);
				
				salaryLabel2.setBounds(285,225,75,25);
				employermainPanel.add(salaryLabel2);
				
				employerFrame.setVisible(true);
		}
		
	//properties of admin Page
	private static JFrame adminFrame = new JFrame("Admin Page");
	private static JButton showDatabaseAdmin = new JButton ("Show Database"); 
	private static JButton addRow = new JButton ("Add Row");
	private static JButton deleteRow = new JButton ("Delete Row");
	private static JButton updateRow = new JButton ("Update Row");
	private static JButton exitAdminPage = new JButton ("Exit");
	private static JTextField nameTextFieldAdmin = new JTextField();
	private static JTextField jobTextFieldAdmin = new JTextField();
	private static JTextField salaryTextFieldAdmin = new JTextField();
	private static JTextField ındexTextFieldAdmin = new JTextField();
	private static JTextField ındexTextField2Admin = new JTextField();
	private static JTextField salaryTextField2Admin = new JTextField();	
	private static JTextField jobTextFieldAdmin2 = new JTextField();
	private static JTextField nameTextFieldAdmin2 = new JTextField();	
	private static JLabel nameLabelAdmin = new JLabel("Name");
	private static JLabel jobLabelAdmin = new JLabel("Job");
	private static JLabel salaryLabelAdmin = new JLabel("Salary");
	private static JLabel ındexLabelAdmin = new JLabel("Index");
	private static JLabel ındexLabel2Admin = new JLabel("Index");
	private static JLabel salaryLabel2Admin = new JLabel("Salary");
	private static JLabel jobLabelAdmin2 = new JLabel("Job");
	private static JLabel nameLabelAdmin2 = new JLabel("Name");
	//getters of admin Page
	public JFrame getAdminFrame() {
		return adminFrame;
	}
	public JButton getExitAdminPage() {
		return exitAdminPage;
	}
	public JButton getShowDatabaseAdmin() {
		return showDatabaseAdmin;
	}
	public JButton getAddRow() {
		return addRow;
	}
	
	//Open admin Page 
	public void openAdminPage() throws Exception {
		adminFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		adminFrame.setSize(600,500);
		adminFrame.setResizable(false);	
		
		//MainPanel
		JPanel adminMainPanel = new JPanel ();
		adminFrame.add(adminMainPanel);
		adminMainPanel.setBounds(0,30,300,230);
		adminMainPanel.setLayout(null);
		
			//Buttons
			showDatabaseAdmin.setBounds(175,100,300,25);
			adminMainPanel.add(showDatabaseAdmin);
			showDatabaseAdmin.addActionListener(new Controller());
			
			exitAdminPage.setBounds(175,300,300,25);
			exitAdminPage.addActionListener(new Controller());
			adminMainPanel.add(exitAdminPage);
			
			addRow.setBounds(350,150,125,25);
			addRow.addActionListener(new Controller());
			adminMainPanel.add(addRow);
			
			deleteRow.setBounds(350,200,125,25);
			deleteRow.addActionListener(new Controller());
			adminMainPanel.add(deleteRow);
			
			updateRow.setBounds(350,250,125,25);
			updateRow.addActionListener(new Controller());
			adminMainPanel.add(updateRow);
			
			exitPage.setBounds(175,300,300,25);
			adminMainPanel.add(exitPage);
			
			//Text Fields
			nameTextFieldAdmin.setBounds(175,150,75,25);
			adminMainPanel.add(nameTextFieldAdmin);
			
			jobTextFieldAdmin.setBounds(250,150,50,25);
			adminMainPanel.add(jobTextFieldAdmin);
			
			salaryTextFieldAdmin.setBounds(300,150,50,25);
			adminMainPanel.add(salaryTextFieldAdmin);
			
			ındexTextFieldAdmin.setBounds(175,200,175,25);
			adminMainPanel.add(ındexTextFieldAdmin);
			
			ındexTextField2Admin.setBounds(175,250,43,25);
			adminMainPanel.add(ındexTextField2Admin);
			
			nameTextFieldAdmin2.setBounds(218,250,45,25);
			adminMainPanel.add(nameTextFieldAdmin2);
			
			jobTextFieldAdmin2.setBounds(263,250,45,25);
			adminMainPanel.add(jobTextFieldAdmin2);
			
			salaryTextField2Admin.setBounds(308,250,42,25);
			adminMainPanel.add(salaryTextField2Admin);
			
			//Labels
			
			nameLabelAdmin.setBounds(175,125,75,25);
			adminMainPanel.add(nameLabelAdmin);
			
			jobLabelAdmin.setBounds(260,125,75,25);
			adminMainPanel.add(jobLabelAdmin);
			
			salaryLabelAdmin.setBounds(305,125,75,25);
			adminMainPanel.add(salaryLabelAdmin);
			
			ındexLabelAdmin.setBounds(175,175,75,25);
			adminMainPanel.add(ındexLabelAdmin);
			
			ındexLabel2Admin.setBounds(175,225,75,25);
			adminMainPanel.add(ındexLabel2Admin);
			
			nameLabelAdmin2.setBounds(220,225,75,25);
			adminMainPanel.add(nameLabelAdmin2);
			
			jobLabelAdmin2.setBounds(270,225,75,25);
			adminMainPanel.add(jobLabelAdmin2);
			
			salaryLabel2Admin.setBounds(310,225,75,25);
			adminMainPanel.add(salaryLabel2Admin);

			adminFrame.setVisible(true);
	}	

	//properties of Employee Database
	private static JFrame employeeDatabaseFrame = new JFrame("Employee Database");
	private static JButton returnEmployeeDatabase = new JButton ("Return");
	private static JTextArea dataTable=new JTextArea();
	private static JLabel employeeDatabaseLabel = new JLabel("Name,Job,Salary");
	private static JPanel employeeDatabaseMainPanel = new JPanel ();

	//getters of Employee Database
	public JButton getReturnEmployeeDatabase(){
		return returnEmployeeDatabase;
	}
	public JFrame getEmployeeDatabaseFrame() {
		return employeeDatabaseFrame;
	}
	public JTextArea getDataTable() {
		return dataTable;
	}
	public void setDataTable(JTextArea table) {
		View.dataTable=table;
	}
	
	//Open Employee Database 
	public void openEmployeeDatabase() throws Exception {
		employeeDatabaseFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		employeeDatabaseFrame.setSize(600,500);
		employeeDatabaseFrame.setResizable(false);	
		
		//MainPanel
		employeeDatabaseFrame.add(employeeDatabaseMainPanel);
		employeeDatabaseMainPanel.setLayout(null);
			
			//Buttons
			returnEmployeeDatabase.setBounds(230,305,150,25);
			employeeDatabaseMainPanel.add(returnEmployeeDatabase);
			returnEmployeeDatabase.addActionListener(new Controller());
			
			//Labels
			employeeDatabaseLabel.setBounds(250,75,150,25);
			employeeDatabaseMainPanel.add(employeeDatabaseLabel);
			
			//Data Table
			dataTable.setBounds(175,100,225,200);
			employeeDatabaseMainPanel.add(dataTable);
			dataTable.setEditable(false);
			
			
			
		employeeDatabaseFrame.setVisible(true);
	}
	

	//properties of Employee Page
	private static JFrame employeeFrame = new JFrame("Employee Page");
	private static JButton exitEmployee = new JButton ("Exit"); 
	private static JLabel employeeLabel = new JLabel("Name,Job,Salary");
	private static JLabel employeeInfo = new JLabel();
	//getters of Employee Page
	public JButton getExitEmployee(){
		return exitEmployee;
	}
	public JFrame getEmployeeFrame() {
		return employeeFrame;
	}
	//Open Employee Page 
	public void openEmployeePage() throws Exception {
		employeeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		employeeFrame.setSize(600,500);
		employeeFrame.setResizable(false);	
		
		
		//MainPanel
		JPanel employeeMainPanel = new JPanel ();
		employeeFrame.add(employeeMainPanel);
		employeeMainPanel.setLayout(null);
			
			//Buttons
			exitEmployee.setBounds(230,305,135,25);
			employeeMainPanel.add(exitEmployee);
			exitEmployee.addActionListener(new Controller());
			
			//Labels
			employeeLabel.setBounds(250,265,150,25);
			employeeMainPanel.add(employeeLabel);
			
			employeeInfo.setBounds(245,280,150,25);
			employeeMainPanel.add(employeeInfo);
			
			
		employeeFrame.setVisible(true);
	}
	public static JLabel getLoginLabel() {
		return loginLabel;
	}
	public static void setLoginLabel(JLabel loginLabel) {
		View.loginLabel = loginLabel;
	}
	public static JLabel getUsernameLabel() {
		return usernameLabel;
	}
	public static void setUsernameLabel(JLabel usernameLabel) {
		View.usernameLabel = usernameLabel;
	}
	public static JLabel getPasswordLabel() {
		return passwordLabel;
	}
	public static void setPasswordLabel(JLabel passwordLabel) {
		View.passwordLabel = passwordLabel;
	}
	public static JButton getExitPage() {
		return exitPage;
	}
	public static void setExitPage(JButton exitPage) {
		View.exitPage = exitPage;
	}
	public static JLabel getNameLabel() {
		return nameLabel;
	}
	public static void setNameLabel(JLabel nameLabel) {
		View.nameLabel = nameLabel;
	}
	public static JLabel getJobLabel() {
		return jobLabel;
	}
	public static void setJobLabel(JLabel jobLabel) {
		View.jobLabel = jobLabel;
	}
	public static JLabel getSalaryLabel() {
		return salaryLabel;
	}
	public static void setSalaryLabel(JLabel salaryLabel) {
		View.salaryLabel = salaryLabel;
	}
	public static JLabel getIndexLabel() {
		return ındexLabel;
	}
	public static void setIndexLabel(JLabel indexLabel) {
		ındexLabel = indexLabel;
	}
	public static JLabel getIndexLabel2() {
		return ındexLabel2;
	}
	public static void setIndexLabel2(JLabel indexLabel2) {
		ındexLabel2 = indexLabel2;
	}
	public static JLabel getSalaryLabel2() {
		return salaryLabel2;
	}
	public static void setSalaryLabel2(JLabel salaryLabel2) {
		View.salaryLabel2 = salaryLabel2;
	}
	public JButton getDeleteRow() {
		return deleteRow;
	}
	public static void setDeleteRow(JButton deleteRow) {
		View.deleteRow = deleteRow;
	}
	public static JButton getUpdateRow() {
		return updateRow;
	}
	public static void setUpdateRow(JButton updateRow) {
		View.updateRow = updateRow;
	}
	public JTextField getNameTextFieldAdmin() {
		return nameTextFieldAdmin;
	}
	public static void setNameTextFieldAdmin(JTextField nameTextFieldAdmin) {
		View.nameTextFieldAdmin = nameTextFieldAdmin;
	}
	public JTextField getJobTextFieldAdmin() {
		return jobTextFieldAdmin;
	}
	public static void setJobTextFieldAdmin(JTextField jobTextFieldAdmin) {
		View.jobTextFieldAdmin = jobTextFieldAdmin;
	}
	public static JTextField getSalaryTextFieldAdmin() {
		return salaryTextFieldAdmin;
	}
	public static void setSalaryTextFieldAdmin(JTextField salaryTextFieldAdmin) {
		View.salaryTextFieldAdmin = salaryTextFieldAdmin;
	}
	public static JTextField getIndexTextFieldAdmin() {
		return ındexTextFieldAdmin;
	}
	public static void setIndexTextFieldAdmin(JTextField indexTextFieldAdmin) {
		ındexTextFieldAdmin = indexTextFieldAdmin;
	}
	public static JTextField getIndexTextField2Admin() {
		return ındexTextField2Admin;
	}
	public static void setIndexTextField2Admin(JTextField indexTextField2Admin) {
		ındexTextField2Admin = indexTextField2Admin;
	}
	public static JTextField getSalaryTextField2Admin() {
		return salaryTextField2Admin;
	}
	public static void setSalaryTextField2Admin(JTextField salaryTextField2Admin) {
		View.salaryTextField2Admin = salaryTextField2Admin;
	}
	public static JTextField getJobTextFieldAdmin2() {
		return jobTextFieldAdmin2;
	}
	public static void setJobTextFieldAdmin2(JTextField jobTextFieldAdmin2) {
		View.jobTextFieldAdmin2 = jobTextFieldAdmin2;
	}
	public static JTextField getNameTextFieldAdmin2() {
		return nameTextFieldAdmin2;
	}
	public static void setNameTextFieldAdmin2(JTextField nameTextFieldAdmin2) {
		View.nameTextFieldAdmin2 = nameTextFieldAdmin2;
	}
	public static JLabel getNameLabelAdmin() {
		return nameLabelAdmin;
	}
	public static void setNameLabelAdmin(JLabel nameLabelAdmin) {
		View.nameLabelAdmin = nameLabelAdmin;
	}
	public static JLabel getJobLabelAdmin() {
		return jobLabelAdmin;
	}
	public static void setJobLabelAdmin(JLabel jobLabelAdmin) {
		View.jobLabelAdmin = jobLabelAdmin;
	}
	public static JLabel getSalaryLabelAdmin() {
		return salaryLabelAdmin;
	}
	public static void setSalaryLabelAdmin(JLabel salaryLabelAdmin) {
		View.salaryLabelAdmin = salaryLabelAdmin;
	}
	public JLabel getIndexLabelAdmin() {
		return ındexLabelAdmin;
	}
	public static void setIndexLabelAdmin(JLabel indexLabelAdmin) {
		ındexLabelAdmin = indexLabelAdmin;
	}
	public static JLabel getIndexLabel2Admin() {
		return ındexLabel2Admin;
	}
	public static void setIndexLabel2Admin(JLabel indexLabel2Admin) {
		ındexLabel2Admin = indexLabel2Admin;
	}
	public static JLabel getSalaryLabel2Admin() {
		return salaryLabel2Admin;
	}
	public static void setSalaryLabel2Admin(JLabel salaryLabel2Admin) {
		View.salaryLabel2Admin = salaryLabel2Admin;
	}
	public static JLabel getJobLabelAdmin2() {
		return jobLabelAdmin2;
	}
	public static void setJobLabelAdmin2(JLabel jobLabelAdmin2) {
		View.jobLabelAdmin2 = jobLabelAdmin2;
	}
	public static JLabel getNameLabelAdmin2() {
		return nameLabelAdmin2;
	}
	public static void setNameLabelAdmin2(JLabel nameLabelAdmin2) {
		View.nameLabelAdmin2 = nameLabelAdmin2;
	}
	public static JLabel getEmployeeDatabaseLabel() {
		return employeeDatabaseLabel;
	}
	public static void setEmployeeDatabaseLabel(JLabel employeeDatabaseLabel) {
		View.employeeDatabaseLabel = employeeDatabaseLabel;
	}
	public static JPanel getEmployeeDatabaseMainPanel() {
		return employeeDatabaseMainPanel;
	}
	public static void setEmployeeDatabaseMainPanel(JPanel employeeDatabaseMainPanel) {
		View.employeeDatabaseMainPanel = employeeDatabaseMainPanel;
	}
	public static JLabel getEmployeeLabel() {
		return employeeLabel;
	}
	public static void setEmployeeLabel(JLabel employeeLabel) {
		View.employeeLabel = employeeLabel;
	}
	public JLabel getEmployeeInfo() {
		return employeeInfo;
	}
	public static void setEmployeeInfo(JLabel employeeInfo) {
		View.employeeInfo = employeeInfo;
	}
	public static void setLoginFrame(JFrame loginFrame) {
		View.loginFrame = loginFrame;
	}
	public static void setUsernameTextField(JTextField usernameTextField) {
		View.usernameTextField = usernameTextField;
	}
	public static void setPasswordTextField(JPasswordField passwordTextField) {
		View.passwordTextField = passwordTextField;
	}
	public static void setLoginButton(JButton loginButton) {
		View.loginButton = loginButton;
	}
	public static void setExitButton(JButton exitButton) {
		View.exitButton = exitButton;
	}
	public static void setEmployerFrame(JFrame employerFrame) {
		View.employerFrame = employerFrame;
	}
	public static void setShowDatabaseEmployer(JButton showDatabaseEmployer) {
		View.showDatabaseEmployer = showDatabaseEmployer;
	}
	public static void setHireEmployee(JButton hireEmployee) {
		View.hireEmployee = hireEmployee;
	}
	public static void setFireEmployee(JButton fireEmployee) {
		View.fireEmployee = fireEmployee;
	}
	public static void setRaiseSalary(JButton raiseSalary) {
		View.raiseSalary = raiseSalary;
	}
	public static void setNameTextField(JTextField nameTextField) {
		View.nameTextField = nameTextField;
	}
	public static void setJobTextField(JTextField jobTextField) {
		View.jobTextField = jobTextField;
	}
	public static void setSalaryTextField(JTextField salaryTextField) {
		View.salaryTextField = salaryTextField;
	}
	public static void setIndexTextField(JTextField indexTextField) {
		ındexTextField = indexTextField;
	}
	public static void setIndexTextField2(JTextField indexTextField2) {
		ındexTextField2 = indexTextField2;
	}
	public static void setSalaryTextField2(JTextField salaryTextField2) {
		View.salaryTextField2 = salaryTextField2;
	}
	public static void setAdminFrame(JFrame adminFrame) {
		View.adminFrame = adminFrame;
	}
	public static void setShowDatabaseAdmin(JButton showDatabaseAdmin) {
		View.showDatabaseAdmin = showDatabaseAdmin;
	}
	public static void setAddRow(JButton addRow) {
		View.addRow = addRow;
	}
	public static void setExitAdminPage(JButton exitAdminPage) {
		View.exitAdminPage = exitAdminPage;
	}
	public static void setEmployeeDatabaseFrame(JFrame employeeDatabaseFrame) {
		View.employeeDatabaseFrame = employeeDatabaseFrame;
	}
	public static void setReturnEmployeeDatabase(JButton returnEmployeeDatabase) {
		View.returnEmployeeDatabase = returnEmployeeDatabase;
	}
	public static void setEmployeeFrame(JFrame employeeFrame) {
		View.employeeFrame = employeeFrame;
	}
	public static void setExitEmployee(JButton exitEmployee) {
		View.exitEmployee = exitEmployee;
	}


}	