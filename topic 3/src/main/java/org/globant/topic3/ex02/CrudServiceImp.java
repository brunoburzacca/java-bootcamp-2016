package org.globant.topic3.ex02;

import java.util.Scanner;

public class CrudServiceImp implements CrudService {
	protected CrudServiceImp() {
	};

	public void create() {
		UserObject[] user = CrudTest.getUser();

		// Create user

	
		String newUser = null, newPass = null, newName = null;

		System.out.println("insert new user: ");
		Scanner scanUser = new Scanner(System.in);
		newUser = scanUser.next();

		System.out.println("insert new pass: ");
		Scanner scanPass = new Scanner(System.in);
		newPass = scanPass.next();

		System.out.println("insert new name: ");
		Scanner scanName = new Scanner(System.in);
		newName = scanName.next();

		for (int i = 0; i <= 4; i++) {
			if (user[i].id == null) {
				user[i].id = newUser;
				user[i].pass = newPass;
				user[i].name = newName;
				System.out.println("the user was registered successfuly");
				break;
			}
		}

		for (int i = 0; i <= 4; i++) {
			System.out.println(user[i].id + user[i].pass);
		}
	}

	public void read() {
		UserObject[] user = CrudTest.getUser();
		String userRead=null;
		
		System.out.println("insert the name of the user you wnat to see: ");
		Scanner scanUser = new Scanner(System.in);
		userRead = scanUser.next();
		
		for(int i=0 ; i<=4; i++){
			if(user[i].id.equals(userRead)){
				System.out.println("the user is: "+ user[i].id+ " The pass is: "+ user[i].pass+" the name is : "+ user[i].name);
			}
		}
		

	}

	public void update() {
		UserObject[] user = CrudTest.getUser();
		String updatedUser = null, updatedPass = null, updatedName = null;
		int update =-1;
		
		
		System.out.println("insert the number of user you want to update:");
		Scanner updateScan = new Scanner(System.in);
		update = updateScan.nextInt();

		System.out.println("insert new user: ");
		Scanner scanUser = new Scanner(System.in);
		updatedUser = scanUser.next();

		System.out.println("insert new pass: ");
		Scanner scanPass = new Scanner(System.in);
		updatedPass = scanPass.next();

		System.out.println("insert new name: ");
		Scanner scanName = new Scanner(System.in);
		updatedName = scanName.next();
		
		user[update-1].id = updatedUser;
		user[update-1].pass = updatedPass;
		user[update-1].name = updatedName;
		
		for(int i=0 ; i<=4; i++){
			
				System.out.println("the user is: "+ user[i].id+ " The pass is: "+ user[i].pass+" the name is : "+ user[i].name);
			
		}
		
	}

	public void delete() {
		UserObject[] user = CrudTest.getUser();
		int deletedUser=-1;
		
		System.out.println("insert the number of user you want to delete:");
		Scanner updateScan = new Scanner(System.in);
		deletedUser = updateScan.nextInt();
		user[deletedUser-1].state = false;
		
		for(int i=0 ; i<=4; i++){
			
			System.out.println("the user is: "+ user[i].id+ " The pass is: "+ user[i].pass+" the name is : "+ user[i].name +" the state id: "+ user[i].state);
		
	}
		
		

	}

}
