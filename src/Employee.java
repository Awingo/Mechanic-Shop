
public class Employee {
	
	private String EmployeeName;
	private String EmployeePosition;
	
	
	public Employee(String name, String position) 
	{
		EmployeeName = name;
		EmployeePosition = position;
	}
	
	public Employee()
	{
		
		
	}
	
	public String getEmployeeName()
	{
		return this.EmployeeName;
	}
	
	public String getEmployeePosition()
	{
		return this.EmployeePosition;
	}
	public void setEmployeeName(String name)
	{
		EmployeeName = name;
	}
	
	public void SetEmployeePosition(String position)
	{
		EmployeePosition = position;
	}
	public void printEmployee()
	{
		System.out.println("Name:   " + this.getEmployeeName() + "\n\t" + this.getEmployeePosition()
		+ "\n\t"); 
	}
}
