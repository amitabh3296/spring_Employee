package spring_Employee;

import java.util.List;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new  ClassPathXmlApplicationContext("Beans.xml"); 
		EmployeeDAO empDAO=(EmployeeDAO)context.getBean("edao");
		
		for(;;)
		{
			System.out.println("\nEnter your choice : \n"
						 + "1 Add Employee \n"
						 + "2.Delete Employee \n"
						 + "3.Search Employee \n"
						 + "4.List all Emp\n"
						 + "5.Exit");
		
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
			case 1:
				System.out.println("Enter name ");
				String name=sc.nextLine();
				System.out.println("Enter id ");
				String id=sc.nextLine();
				System.out.println("Enter salary ");
				float salary=sc.nextFloat();
				Employee e=new Employee(name,salary,id);
				empDAO.addEmployee(e);
				System.out.println();
				System.out.println("Employee added successfully");
				break;
			
			case 2: System.out.println("Enter Emp. Id to delete: ");
					String empId=sc.nextLine();
					empDAO.deleteEmployee(empId);
					System.out.println("Deleted successfully\n");
				break;
				
			case 3: System.out.println("Enter Emp. Id to search: ");
					String eId=sc.nextLine();
					Employee emp = empDAO.getEmployee(eId);
					  System.out.print("\n Id : " + emp.getEmpId() );
				      System.out.print("\n Name : " + emp.getName() );
				      System.out.println("\n Salary : " + emp.getSalary());
					break;
					
			case 4: List<Employee> emps=empDAO.getAllEmployees();
					for(Employee em:emps)
					{
						System.out.println("  ID : "+em.getEmpId()+"   Name : "+em.getName()+"   Salary : "+em.getSalary());
					}
					
					break;
					
			default: System.exit(0);
				
			}
		}

	}

}
