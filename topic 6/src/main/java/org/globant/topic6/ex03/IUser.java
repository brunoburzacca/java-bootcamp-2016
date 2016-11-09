package org.globant.topic6.ex03;

import java.util.ArrayList;

public interface IUser {
	public ArrayList<User> showUsers();
	public String addUser(String name,String nickName,String password);
	public String deleteUser(String name);
	public String updateUser(String name);
	public User findByName(String name);
	public User findByNickName(String nickName);
	
}