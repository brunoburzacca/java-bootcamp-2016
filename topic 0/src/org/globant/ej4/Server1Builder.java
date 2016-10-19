package org.globant.ej4;

public class Server1Builder implements ConeccionBuilder {
	private Coneccion coneccion;
	
	public Server1Builder(){
		coneccion = new Coneccion();
	}
	

	@Override
	public void db() {
		coneccion.setDb("base de datos numero 1");
		
	}

	@Override
	public void consulta1() {
		coneccion.setConsulta1("Set");
		
	}

	@Override
	public void consulta2() {
		coneccion.setConsulta2("update");
		
	}

	@Override
	public Coneccion coneccionServer() {
		return coneccion;
		
	}

}
