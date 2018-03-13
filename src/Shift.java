
public class Shift {
	public String ShiftName;
	public Employee[] Roster;
	public int NumberOfEmployees;
	public Shift() {
		
	}
	public Shift(String Name, Employee[] Employees) {
		
		ShiftName = Name;
		Roster = Employees;
		NumberOfEmployees = Roster.length;
	}
	public int getNumberOfEmployees() {
		return NumberOfEmployees;
	}
	public Employee[] getRoster() {
		return Roster;
	}
	public String getShiftName() {
		return ShiftName;
	}
	public void setName(String name) {
		ShiftName = name;
	}
	public void setRoster(Employee[] Employees) {
		Roster = Employees;
		NumberOfEmployees = Roster.length;
	}
	public void printShift() {
		System.out.println("Shift Name: " + this.getShiftName() + "\n");
		Employee[] Shift = this.getRoster();
		for(int i = 0; i < this.getNumberOfEmployees(); i++ ) {
			Shift[i].printEmployee();
		}
	}
}
