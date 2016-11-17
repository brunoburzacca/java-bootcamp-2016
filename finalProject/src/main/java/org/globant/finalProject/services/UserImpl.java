package org.globant.finalProject.services;

import org.globant.finalProject.data.UserDB;
import org.globant.finalProject.model.User;
import org.springframework.stereotype.Service;


@Service
public class UserImpl implements IUser{
	

	
	@Override
	public String addUser(String name, String password, String mail, int phone) {
		
		UserDB user = new UserDB();
		
		if(user.findUser(name)!=true){
			user.addUser(name, password, mail, phone);
			return "user registered";
		}else{
			return "user already exist";
		}
						
	}

	@Override
	public String logginUser(User user) {
		UserDB userLogged = new UserDB();
		
		if(userLogged.userLoggin(user)==true){
			
			return "loggin successful";
		}else{
			return "loggin fail";
		}
		
		
	}
	@Override
	public User logOff(User user){
		user.setName(null);
		user.setPassword(null);
		user.setUserId(0);
		return user;
		
	}

	
	public User cast(User user){
		user.setName(null);
		user.setPassword(null);
		user.setUserId(0);
		return user;
		
	}
	
	
}
