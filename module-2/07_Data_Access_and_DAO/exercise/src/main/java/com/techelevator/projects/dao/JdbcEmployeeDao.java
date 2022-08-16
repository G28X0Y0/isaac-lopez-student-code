package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.projects.model.Employee;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcEmployeeDao implements EmployeeDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcEmployeeDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<>();
		String sql = "SELECT * FROM employee";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while(results.next()){
			employees.add(mapToEmployee(results));
		}
		return employees;
	}

	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
		List<Employee> employees = new ArrayList<>();
		SqlRowSet results = null;
		if(firstNameSearch.length() > 0 && lastNameSearch.length() > 0){
		String sql = "SELECT * FROM employee WHERE first_name ILIKE ? AND last_name ILIKE ?";
		results = jdbcTemplate.queryForRowSet(sql, "%" + firstNameSearch + "%", "%" + lastNameSearch + "%");
		} else if (firstNameSearch.length() == 0 && lastNameSearch.length() > 0){
			String sql = "SELECT * FROM employee WHERE last_name ILIKE ?";
			results = jdbcTemplate.queryForRowSet(sql, "%" + lastNameSearch + "%");
		} else if (firstNameSearch.length() > 0) {
			String sql = "SELECT * FROM employee WHERE first_name ILIKE ?";
			results = jdbcTemplate.queryForRowSet(sql, "%" + firstNameSearch);
		}
		while(results.next()){
			employees.add(mapToEmployee(results));
		}
		return employees;
	}

	@Override
	public List<Employee> getEmployeesByProjectId(int projectId) {
		List<Employee> employees = new ArrayList<>();
		String sql = "SELECT * FROM employee JOIN project_employee pe on employee.employee_id = pe.employee_id WHERE project_id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, projectId);
		while(results.next()){
			employees.add(mapToEmployee(results));
		}
		return employees;
	}

	@Override
	public void addEmployeeToProject(int projectId, int employeeId) {
		String sql = "INSERT INTO project_employee(project_id, employee_id) VALUES (?, ?)";
		jdbcTemplate.update(sql, projectId, employeeId);
	}

	@Override
	public void removeEmployeeFromProject(int projectId, int employeeId) {
		String sql ="DELETE FROM project_employee WHERE project_id = ? AND employee_id = ?";
		jdbcTemplate.update(sql, projectId, employeeId);
	}

	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		List<Employee> employees = new ArrayList<>();
		String sql = "SELECT * FROM employee LEFT JOIN project_employee pe on employee.employee_id = pe.employee_id WHERE project_id IS NULL";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sql);
		while(result.next()){
			employees.add(mapToEmployee(result));
		}
		return employees;
	}

	public Employee mapToEmployee(SqlRowSet rowSet){
		Employee employee = new Employee();
		employee.setId(rowSet.getInt("employee_id"));
		employee.setDepartmentId(rowSet.getInt("department_id"));
		employee.setFirstName(rowSet.getString("first_name"));
		employee.setLastName(rowSet.getString("last_name"));
		employee.setBirthDate(rowSet.getDate("birth_date").toLocalDate());
		employee.setHireDate(rowSet.getDate("hire_date").toLocalDate());
		return employee;


	}


}
