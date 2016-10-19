package org.globant.ej02;

public class FactoryProducer {
	
	public static AbstractFactory GetFactory(String eleccion) {
		if (eleccion.equalsIgnoreCase("server")) {
			return new ConeccionFactory();
		} else if (eleccion.equalsIgnoreCase("accion")) {
			return new AccionFactory();

		}
		return null;

	}
}
