package org.globant.topic3.ex02;

public class UserObject {
	public String id=null, pass=null, name=null;
	boolean state = true;
	public UserObject(String id1, String pass1, boolean state1 ,String name1){
		this.id =id1;
		this.pass =pass1;
		this.state =state1;
		this.name =name1;
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
}
