package org.globant.ej03;
import java.util.Date;

public class Proxy {
	ServerLento serverLento;
	public Proxy(){
		System.out.println("creando proxy en:"+ new Date());
	}
	
	public void conectar(){
		if (serverLento == null ){
			serverLento = new ServerLento();
		}
		serverLento.server();
		
	}

}
