package org.globant.finalProject.model;

public class User {
	String name;
	String password;
	int userId;
	public User(String nameParam,String passwordParam,int userIdParam){
		super();
		this.name=nameParam;
		this.password=passwordParam;
		this.userId=userIdParam;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
}
