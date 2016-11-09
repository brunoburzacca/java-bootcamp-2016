package org.globant.topic6.ex03;


public class User {
	String name = null, nickName =null, password = null;
	boolean state =true;
	 
	public User(String name1,String nickName1,String password1, boolean state1){
		this.name=name1;
		this.nickName=nickName1;
		this.password=password1;
		this.state=state1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

}