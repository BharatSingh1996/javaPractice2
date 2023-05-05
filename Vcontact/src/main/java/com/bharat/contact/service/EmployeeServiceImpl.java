package com.bharat.contact.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bharat.contact.entity.Employee;
import com.bharat.contact.repo.EmpRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmpRepo repo;

	@Override
	public List<Employee> getAll() {

		List<Employee> list = repo.findAll();
		return list;
	}

	@Override
	public Employee getById(Long id) {

		Optional<Employee> optional = repo.findById(id);
		Employee emp=null;
		 if(optional.isPresent())
		emp=optional.get();
		 else {
			 throw new RuntimeException("Resource not Found "+ id);
		 }
		return emp ;
	}

	@Override
	public void Create(Employee emp) {
		
		repo.save(emp);
	}

	@Override
	public void Delete(Long id) {

		repo.deleteById(id);
	}



}
