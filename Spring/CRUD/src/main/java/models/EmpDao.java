package models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class EmpDao {
	@Autowired
	JdbcTemplate template;

	public EmpDao() {

	}

	public EmpDao(JdbcTemplate template) {
		super();
		this.template = template;
	}

	public void setTmplate(JdbcTemplate template) {
		this.template = template;
	}

	public int saveEmployee(Employee e) {
		String sql = "INSERT INTO employees (name,salary,job) VALUES (" + "'"+e.getName()+"'" + "," + e.getSalary() + ","+
				"'"	+ e.getJob()+"'" + ")";
		return template.update(sql);
	}

	public int deleteEmployee(Employee e) {
		String sql = "DELETE FROM employees WHERE id=" + e.getId();
		return template.update(sql);
	}

	public int updateEmployee(Employee e) {
		String sql = "UPDATE employees set name='" + e.getName() + "',salary='" + e.getSalary() + "',job='" + e.getJob()
				+ "' WHERE id='" + e.getId()+"'";
		return template.update(sql);
	}

	public int updateEmployeeById(int id, Employee e) {
		String sql = "UPDATE employees set name='" + e.getName() + "',salary=" + e.getSalary() + ",job='" + e.getJob()
				+ "' WHERE id='" + id+"'";
		return template.update(sql);
	}

	public int deleteEmployeeById(int id) {
		String sql = "DELETE FROM employees WHERE id=" + id;
		return template.update(sql);
	}

	public Employee getEmployee(int id) {
		String sql = "SELECT * FROM employees WHERE id=?";
		return template.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper<Employee>(Employee.class));
	}

	public List<Employee> getAllEmployees() {
		String sql = "SELECT * FROM employees";
		return template.query(sql, new RowMapper<Employee>() {
			public Employee mapRow(ResultSet rs, int row) throws SQLException {
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getFloat(3));
				e.setJob(rs.getString(4));
				return e;
			}
		});
	}
}
