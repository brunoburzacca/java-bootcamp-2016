package org.globant.ej03;

public class ServerLento extends Server{
	public ServerLento(){
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		
	}
}
