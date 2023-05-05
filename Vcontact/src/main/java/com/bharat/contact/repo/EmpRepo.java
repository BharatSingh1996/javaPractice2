package com.bharat.contact.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharat.contact.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Long> {

}
