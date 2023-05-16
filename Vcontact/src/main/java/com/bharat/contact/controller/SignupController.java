package com.bharat.contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bharat.contact.entity.SignUpUsers;
import com.bharat.contact.repo.SignUpRepo;

@Controller
@RequestMapping("/signup")
public class SignupController {
	@Autowired
	 private BCryptPasswordEncoder PasswordEncoder;
	
	@Autowired
	private SignUpRepo signUpRepo;

	@GetMapping
	public String getSignup(Model model) {
		SignUpUsers users = new SignUpUsers();
		model.addAttribute("signup", users);

		return "/signup/signup";
	}

	@PostMapping("/save")
	public String save(@ModelAttribute SignUpUsers signup) {

		signup.setRole("Normal");
		signup.setPassword(PasswordEncoder.encode(signup.getPassword()));
		signUpRepo.save(signup);
		return "Home";
	}
}
