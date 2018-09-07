package spring_Employee;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;



public class EmployeeDAO {
	
JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void addEmployee(Employee e)
	{
		String insert="insert into Employee values('"+e.getEmpId()+"','"+e.getName()+"',"+e.getSalary()+")";
    	this.jdbcTemplate.update(insert);	
	}
	
	public List<Employee> getAllEmployees()
	{
	  String read="select * from employee";
     	List<Employee> employees =this.jdbcTemplate.query(read,new EmployeeMapper());
     	return employees;
	}
	
	public void deleteEmployee(String id)
	{
		String delete="delete from employee where id='"+id+"'";
		
		String deleteQuery = "delete from employee where id = ?";
		jdbcTemplate.update(deleteQuery, id);
		
     	//return this.jdbcTemplate.update(delete,new EmployeeMapper());
    }
	
//	public List<Employee> searchEmployee(String id)
//	{
//	  String read="select * from employee where id='"+id+"'";
//     	List<Employee> employees =this.jdbcTemplate.query(read,new EmployeeMapper());
//     	return employees;
//	}
	
		public Employee getEmployee(String id) 
		{
	      String SQL = "select * from employee where id = ?";
	      Employee emp = jdbcTemplate.queryForObject(SQL, 
	         new Object[]{id}, new EmployeeMapper());
	      
	      return emp;
	      
		}
	
	

}
