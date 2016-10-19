package org.globant.ej02;

public abstract class AbstractFactory {
	abstract Coneccion getConeccion(String coneccion);
	abstract Accion getAccion(String accion);
}
