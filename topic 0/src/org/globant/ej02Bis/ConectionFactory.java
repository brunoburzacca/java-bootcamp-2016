package org.globant.ej02Bis;

public class ConectionFactory extends OptionFactory {

	@Override
	public Option getOption(String type) {
		if ("server 1".equals(type)) {
			return new Server1();
		} else {
			return new Server2();
		}
	}

	

}