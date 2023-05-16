package com.bharat.contact.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.bharat.contact.entity.SignUpUsers;
import com.bharat.contact.repo.SignUpRepo;

public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private SignUpRepo signUpRepo;
	@Override
	public UserDetails loadUserByUsername(String username) 
			throws UsernameNotFoundException {

		 SignUpUsers user = signUpRepo.findUserByUsername(username);
		
		return new CustomUserDetails(user);
	}

}
