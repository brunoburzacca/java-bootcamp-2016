package org.globant.ej02Bis;

public class Demo {

	public static void main(String[] args) {
		AbstractFactory abstractFactory = new AbstractFactory();

		OptionFactory optionFactory = abstractFactory.getOptionFactory("conection");
		Option o1 = optionFactory.getOption("server1");
		System.out.println("o1 : " + o1.make());
		Option o2 = optionFactory.getOption("server1");
		System.out.println("o1 : " + o2.make());

		OptionFactory optionFactory2 = abstractFactory.getOptionFactory("Action");
		Option o3 = optionFactory2.getOption("dog");
		System.out.println("o3 sound: " + o3.make());
		Option o4 = optionFactory2.getOption("dog");
		System.out.println("o3 sound: " + o4.make());

	}

}
