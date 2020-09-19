package com.dxc.dao;

import org.springframework.data.repository.CrudRepository;

import com.dxc.beans.User;

public interface UserRepository extends CrudRepository<User, String> {
	
	//User findbyUser(String username,String password);	
	
}
