package org.globant.ej02;

public  class ConeccionFactory extends AbstractFactory {
	@Override
	public  Coneccion getConeccion(String coneccionServer) {
		if (coneccionServer == null) {
			return null;
		}
		if (coneccionServer.equalsIgnoreCase("server1")) {
			return new Server1DB();
		} else

		if (coneccionServer.equalsIgnoreCase("server2")) {
			return new Server2DB();
		} else if (coneccionServer.equalsIgnoreCase("server3")) {
			return new Server3DB();
		}

		return null;
	}

	@Override
	Accion getAccion(String Accion) {
		// TODO Auto-generated method stub
		return null;
	}

}
