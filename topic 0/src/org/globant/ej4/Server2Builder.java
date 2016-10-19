package org.globant.ej4;

public class Server2Builder implements ConeccionBuilder {
	private Coneccion coneccion;
	
	public Server2Builder(){
		coneccion = new Coneccion();
	}
	

	@Override
	public void db() {
		coneccion.setDb("base de datos numero 2");
		
	}

	@Override
	public void consulta1() {
		coneccion.setConsulta1("select");
		
	}

	@Override
	public void consulta2() {
		coneccion.setConsulta2("set");
		
	}

	@Override
	public Coneccion coneccionServer() {
		return coneccion;
		
	}

}
