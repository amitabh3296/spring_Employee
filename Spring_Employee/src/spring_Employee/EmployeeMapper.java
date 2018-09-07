package spring_Employee;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int num) throws SQLException {
		// TODO Auto-generated method stub
		return new Employee(rs.getString("name"),rs.getFloat("salary"), rs.getString("id"));
	}
	
	

}
