package User;

public interface InsertAndDeleteRows {
	
	public void deleteRow(int index) throws Exception;
		
	public void addRow(String name,String job,int salary) throws Exception;
}
