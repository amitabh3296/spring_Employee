package spring_Employee;


public class Employee {
	
	private String name;
	private float salary;
	private String empId;
	
	
	public Employee(String name, float salary, String empId) {
		super();
		this.name = name;
		this.salary = salary;
		this.empId = empId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	public String getEmpId() {
		return empId;
	}


	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	
	
	

}
