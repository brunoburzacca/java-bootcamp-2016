package org.globant.ej01;

public class Ej1_singleton {
	private static Ej1_singleton singleton = null;

	private Ej1_singleton() {
	}

	public static Ej1_singleton getInstance() {
		if (singleton == null) {
			singleton = new Ej1_singleton();
		}
		return singleton;

	}
	public void Conection(){
		System.out.println("Usted se ha conectado al servidor");
	}

}


