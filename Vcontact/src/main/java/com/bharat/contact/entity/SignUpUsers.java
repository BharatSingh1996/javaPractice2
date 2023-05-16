package com.bharat.contact.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SignUpUsers {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private  String username;
	private String email;
	private String password;
	private String role;
	@OneToMany( mappedBy = "signUpUsers",  cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Employee> emp;
}
