package TestExample;

public class Student {
	
	
	private String name ;
	private String Department;
	private int rollNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public Student (String name, String Dept, int no)
	{
		this.name = name ; 
		this.Department = Dept;
		this.rollNo = no;
	}
	
	
	
}
