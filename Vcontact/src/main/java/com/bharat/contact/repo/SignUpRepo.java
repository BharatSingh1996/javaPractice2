package com.bharat.contact.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bharat.contact.entity.SignUpUsers;

public interface SignUpRepo extends JpaRepository<SignUpUsers, Integer> {

	@Query("select u from SignUpUsers u where u.email= :username ")
	public SignUpUsers findUserByUsername(@Param("username") String username);
	
}
