package org.globant.ej4;

public class ConeccionDirector {
	private ConeccionBuilder coneccionBuilder = null;
	
	public ConeccionDirector (ConeccionBuilder coneccionBuilder){
		this.coneccionBuilder = coneccionBuilder;
	}
	public void ConstructConeccion(){
		coneccionBuilder.db();
		coneccionBuilder.consulta1();
		coneccionBuilder.consulta2();
	}
	public Coneccion getConeccion(){
		return coneccionBuilder.coneccionServer(); 
	}
}
