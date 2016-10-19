package org.globant.ej02;

public class AccionFactory extends AbstractFactory{

	@Override
	Coneccion getConeccion(String Coneccion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Accion getAccion(String tipoAccion) {
		if (tipoAccion == null) {
			return null;
		}
		if (tipoAccion.equalsIgnoreCase("Select")) {
			return new Select();
		} else

		if (tipoAccion.equalsIgnoreCase("Update")) {
			return new Update();
			
		} else if (tipoAccion.equalsIgnoreCase("Set")) {
			return new Set();
		}

	
		return null;
	}

}
