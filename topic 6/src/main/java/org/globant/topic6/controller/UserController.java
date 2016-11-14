package org.globant.topic6.controller;

import java.util.ArrayList;
import java.util.Scanner;

import org.globant.topic6.ex03.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	ArrayList<User> userList = new ArrayList<User>();

	@RequestMapping("/showUser")
	public ArrayList<User> showUser(){
		return userList;
	}

	

	@RequestMapping("/addUser")
	public String addUser(@RequestParam(value = "name", defaultValue = "") String name,
			@RequestParam(value = "nickName", defaultValue = "") String nickName,
			@RequestParam(value = "password", defaultValue = "") String password,
			@RequestParam(value = "state") boolean state) {
		for (User user : userList) {
			if (user.getName().equals(name)) {
				return "Nickname is already in use";
			}
		}
		userList.add(new User(name, nickName, password, state));
		return "the user : " + name + " was added as: " + nickName;
	}

	@RequestMapping("/deleteUser")
	public String deleteUser(@RequestParam(value = "name", defaultValue = "") String name) {
		for (User user : userList) {
			if (user.getName().equals(name)) {
				user.setState(false);
				return "the user was deleted";
			}
		}
		return "the user doesn't exist";
	}

	@RequestMapping("/updateUser")
	public String updateUser(@RequestParam(value = "name", defaultValue = "") String name,
			@RequestParam(value = "nickName", defaultValue = "") String nickName,
			@RequestParam(value = "password", defaultValue = "") String password,
			@RequestParam(value = "state") boolean state) {
		String newPassword = null;
		for (User user : userList) {
			if (user.getName().equals(name)) {
				
				
				return "the user was updated";
			}
		}
		return "the user doesn't exist";
	}

	@RequestMapping("/findByName")
	public User findByName(@RequestParam(value = "name", defaultValue = "") String name) {

		for (User user : userList) {
			if (user.getName().equals(name)) {

				return user;
			}
		}
		return null;
	}

	@RequestMapping("/findByNickName")
	public User findByNickName(@RequestParam(value = "nickName", defaultValue = "") String nickName) {

		for (User user : userList) {
			if (user.getNickName().equals(nickName)) {

				return user;
			}
		}
		return null;
	}

}