package com.bharat.contact.service;

import java.util.List;

import com.bharat.contact.entity.Employee;

public interface EmployeeService {

	public List<Employee> getAll();
	public Employee getById(Long id);
	public void Create(Employee emp);
	public void Delete(Long id);
}
