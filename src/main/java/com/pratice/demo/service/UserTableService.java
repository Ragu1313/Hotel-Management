package com.pratice.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratice.demo.entity.UserTable;
import com.pratice.demo.repository.UserTableRepository;

@Service
public class UserTableService {
	
	@Autowired
	private  UserTableRepository usertablerepository;
	public void createUser(UserTable user) {
		usertablerepository.save(user);
	}
	public UserTable getUserTable(Long id) {
		return usertablerepository.findById(id).get();
	}
	
}
