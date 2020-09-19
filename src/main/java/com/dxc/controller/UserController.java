package com.dxc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dxc.beans.User;
import com.dxc.dao.UserRepository;

@Controller
public class UserController {

	@Autowired
	UserRepository userRepository;
	User user;

	@RequestMapping("login")
	public String login() {
		return "login";
	}

	@RequestMapping(value = "loginvalidate", method = RequestMethod.POST)
	public String validation(@RequestParam("username") String username, @RequestParam("password") String password) {
//		User user=userRepository.findbyUser(username, password);
//		if (user != null) {
//			return "modules";
//		}
	return null;

	}

	@RequestMapping("register")
	public String addUser() {
		return "register";
	}

	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public String registerUser(User user) {
		if(userRepository.save(user) != null)
		{
			return "login";
		}
		return "login";

	}

	@RequestMapping("modules")
	public String Module() {
		return "modules";
	}
}
