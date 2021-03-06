package org.globant.topic3.ex02;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.globant.topic3.ex02.UserObject;
import org.junit.BeforeClass;
import org.junit.Test;

public class CrudTest {
	static UserObject[] user = new UserObject[5];
	
	@BeforeClass
	public static void init(){
	user[0]= new UserObject("user1", "pass1", true,"name1");
	user[1]= new UserObject("user2", "pass2", true,"name2");
	user[2]= new UserObject(null, null, true,null);
	user[3]= new UserObject(null, null, true,null);
	user[4]= new UserObject(null, null, true,null);
	}	
	
	@Test
	public void test() {
		
		int select=0;
		
		
		System.out.println("select 1 : create ");
		System.out.println("select 2 : read ");
		System.out.println("select 3 : update ");
		System.out.println("select 4 : delete ");
		Scanner scan = new Scanner(System.in);
		select = scan.nextInt();
		
		CrudService shoppingCart1 = CrudFactory.getLocalService();
		
	
		switch (select){
		
		case 1:
			
			//Calling create  with a local instance of the CrudService  
			shoppingCart1.create();
			break;
		
		case 2:
			//Calling read  with a local instance of the CrudService  
			shoppingCart1.read();
			break;
			
		case 3:
			//Calling update  with a local instance of the CrudService  
			shoppingCart1.update();
			break;
		case 4:
			//Calling delete  with a local instance of the CrudService  
			shoppingCart1.delete();
			break;
			
		}
		
		  

	}

	public static UserObject[] getUser() {
		return user;
	}

	public static void setUser(UserObject[] user) {
		CrudTest.user = user;
	}

}
