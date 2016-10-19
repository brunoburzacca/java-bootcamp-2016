package org.globant.ej03;

import java.util.Date;

public abstract class Server {
	public void server() {
		System.out.print(this.getClass().getSimpleName() + "conectado a servidor " + new Date());
	}

}
