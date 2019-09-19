package com.cg.demojpa.dao;
import java.util.List;

import com.cg.demojpa.dto.*;
public interface EmployeeDao {

	public Employee save(Employee emp);
	public List<Employee> findAll();
	public void remove(Integer empId);
	public List<Employee> findBtwSalary(Double min, Double max);
	List<Employee> findBtwSalary(double min, double max);
		
}
