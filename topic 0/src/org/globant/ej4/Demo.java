package org.globant.ej4;

public class Demo {
	public static void main(String[] arg) {
		ConeccionBuilder coneccionBuilder = new Server1Builder();
		ConeccionDirector coneccionDirector = new ConeccionDirector(coneccionBuilder);
		coneccionDirector.ConstructConeccion();
		Coneccion coneccion = coneccionDirector.getConeccion();
		System.out.println("conectado a:" + coneccion);

		coneccionBuilder = new Server2Builder();
		coneccionDirector = new ConeccionDirector(coneccionBuilder);
		coneccionDirector.ConstructConeccion();
		coneccion = coneccionDirector.getConeccion();
		System.out.println("conectado a:" + coneccion);
	}

}
