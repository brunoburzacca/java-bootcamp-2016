package org.globant.ej03;

public class ProxyDemo {
	
	public static void main (String[] arg){
		Proxy proxy = new Proxy();
		
		ServerLento serverLento = new ServerLento();
		serverLento.server();
		proxy.conectar();
	}
}
