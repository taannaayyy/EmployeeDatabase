package MVC;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Controller implements ActionListener{
	
	private View view = new View();
	private Model model = new Model() ;
	public View getView() {
		return this.view;
	}
	public Model getModel() {
		return model;
	}
	private int i = 0;
	private int j = 0;
	private int k = 0;
	private int x = 0;
	
	File file = new File("C:\\Users\\Tanay\\Desktop\\LoginDatas.txt");
	public Controller () throws Exception{
		
	}
	
	public void actionPerformed(ActionEvent e) {	
		if(e.getSource() instanceof JButton) {
			
			//Login Page
			if((JButton)e.getSource()== view.getLoginButton()) {
			
				try {
					Scanner scan = new Scanner(file);
					while(scan.hasNextLine()) {
			    		Scanner scan2= new Scanner(file);
			    		if(scan.nextLine().equals(model.encrypt((view.getUsernameTextField()).getText()))) {
			    			while(scan2.hasNextLine()) {
			            		if(scan2.nextLine().equals(model.Hash(view.getPasswordTextField().getText()))) {
			            			if((view.getUsernameTextField()).getText().equals(model.getAdminUsername())&& view.getPasswordTextField().getText().equals(model.getAdminPassword()) ) {					
			    						if(j<=0) {
			    							try {
			    								view.openAdminPage();
			    							} catch (FileNotFoundException e1) {
			    								e1.printStackTrace();
			    							}
			    							view.getLoginFrame().dispose();
			    							j++;
			    						}
			    						else {
			    							(view.getAdminFrame()).setVisible(true);	
			    							view.getLoginFrame().dispose();
			    						}
			    					}
			            			
			            			if((view.getUsernameTextField()).getText().equals(model.getEmployerUsername())&& view.getPasswordTextField().getText().equals(model.getEmployerPassword()) ) {					
			        					if(i<=0) {
			        						try {
			        							view.openEmployerPage();
			        						} catch (FileNotFoundException e1) {
			        							e1.printStackTrace();
			        						}
			        						view.getLoginFrame().dispose();
			        						i++;
			        					}
			        					else {
			        						(view.getEmployerFrame()).setVisible(true);	
			        						view.getLoginFrame().dispose();
			        					}
			        				}
			        				
			        				if((view.getUsernameTextField()).getText().equals(model.getEmployeeUsername())&& view.getPasswordTextField().getText().equals(model.getEmployeePassword()) ) {					
			        					if(k<=0) {
			        						try {
			        							view.openEmployeePage();
			        						} catch (FileNotFoundException e1) {
			        							e1.printStackTrace();
			        						}
			        						view.getLoginFrame().dispose();
			        						k++;
			        					}
			        					else {
			        						(view.getEmployeeFrame()).setVisible(true);	
			        						view.getLoginFrame().dispose();
			        					}
			        				}
			            			
			            		}
			            	}
			        		scan2.close();
			    		}
			    	}		
					scan.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
				
			}
			
			if((JButton)e.getSource()== view.getExitButton()) {
				System.exit(0);
			}
			
			//Admin Page		
			if((JButton)e.getSource()== view.getExitAdminPage()) {
				(view.getLoginFrame()).setVisible(true);	
				(view.getAdminFrame()).dispose();
			}
			if((JButton)e.getSource()== view.getAddRow()) {
				
				try {
					model.addRow(view.getNameTextFieldAdmin().getText(),view.getJobTextFieldAdmin().getText(),view.getSalaryTextFieldAdmin().getText());
					//model.addRow2(view.getNameTextFieldAdmin().getText(),view.getJobTextFieldAdmin().getText(),view.getSalaryTextFieldAdmin().getText());
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
			
			if((JButton)e.getSource()== view.getDeleteRow()) {
				
				try {
					model.deleteRow(Integer.parseInt(view.getIndexTextFieldAdmin().getText()));
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
			if((JButton)e.getSource()== view.getUpdateRow()) {
				
				try {
					model.edit(view.getNameTextFieldAdmin2().getText(), view.getJobTextFieldAdmin2().getText(), view.getSalaryTextField2Admin().getText(), Integer.parseInt(view.getIndexTextField2Admin().getText()));
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
			
			//Employer Page
			if((JButton)e.getSource()== view.getExitEmployerPage()) {				
				(view.getLoginFrame()).setVisible(true);	
				(view.getEmployerFrame()).dispose();
			}
			if((JButton)e.getSource()== View.getHireEmployee()) {
				
				try {
					model.addRow(View.getNameTextField().getText(),View.getJobTextField().getText(),View.getSalaryTextField().getText());
				} catch (Exception e1) {
					e1.printStackTrace();
				}	
			}
			if((JButton)e.getSource()== View.getFireEmployee()) {
				
				try {
					model.deleteRow(Integer.parseInt(View.getIndexTextField().getText()));
				} catch (Exception e1) {
					e1.printStackTrace();
				}	
			}
			if((JButton)e.getSource()== View.getRaiseSalary()) {
				
				try {
					model.raiseSalary(Integer.parseInt(View.getIndexTextField2().getText()),View.getSalaryTextField2().getText());
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}	
			
			//Employee Page
			if((JButton)e.getSource()== view.getExitEmployee()) {
				(view.getLoginFrame()).setVisible(true);	
				(view.getEmployeeFrame()).dispose();
			}
			
			//Employee Database Page
			if((JButton)e.getSource()== view.getReturnEmployeeDatabase()) {	
				(view.getEmployeeDatabaseFrame()).dispose();
			}
			if(((JButton)e.getSource()== view.getShowDatabaseAdmin()) || ((JButton)e.getSource()== view.getShowDatabaseEmployer())) {
				/*try {
					view.getDataTable().setText(model.decryptArray());
				} catch (Exception e1) {
					e1.printStackTrace();
				}*/
				if(x==0) {
					try {
						view.openEmployeeDatabase();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					x=1;
				}
				else {
					(view.getEmployeeDatabaseFrame()).setVisible(true);
				}					
			}
	
		}	
	}
	
	
}

