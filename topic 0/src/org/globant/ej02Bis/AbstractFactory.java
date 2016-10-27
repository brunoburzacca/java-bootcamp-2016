package org.globant.ej02Bis;

public class AbstractFactory {
	
	public OptionFactory getOptionFactory(String type) {
		if ("conection".equals(type)) {
			return new ConectionFactory();
		} else {
			return new ActionFactory();
		}
	}

	

}

