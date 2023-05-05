package com.bharat.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bharat.contact.entity.Employee;
import com.bharat.contact.service.EmployeeService;

@Controller
@RequestMapping("/home")
public class HomeController {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/all")
	public String getAll(Model model) {

		List<Employee> list = employeeService.getAll();
		model.addAttribute("list", list);

		return "Home";
	}

	@GetMapping("/new")
	public String NewEmpForm(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);

		return "addForm";
	}

	@PostMapping("/save")
	public String Save(@ModelAttribute Employee employee) {

		employeeService.Create(employee);
		return "redirect:/home/all";
	}
	@GetMapping("/updateForm/{id}")
	public String getUpdateForm(@PathVariable("id") Long id ,Model model) {
		Employee employee = employeeService.getById(id);
		model.addAttribute("employee" ,employee);
		
		return "updateForm";
			
	}
	@GetMapping("/delete/{id}")
	public String Delete(@PathVariable("id") Long id) {
		employeeService.Delete(id);
		return "redirect:/home/all";
		
	}

}
