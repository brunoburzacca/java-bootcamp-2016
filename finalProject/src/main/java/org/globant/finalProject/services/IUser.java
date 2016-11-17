package org.globant.finalProject.services;

import org.globant.finalProject.model.User;

public interface IUser {
	public String addUser(String name, String password, String mail, int phone);
	public String logginUser(User user);
	public User logOff(User user);
	
	
}
