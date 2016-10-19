package org.globant.ej02Bis;

public class ActionFactory extends OptionFactory {

	@Override
	public Option getOption(String type) {
		if ("set".equals(type)) {
			return new Set();
		} else {
			return new Update();
		}
	}

}
