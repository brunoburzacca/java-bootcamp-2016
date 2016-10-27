
package org.globant.ej02;

public class AbstractFactoryMain {
	
	public static void main(String[] arg){
		
		AbstractFactory accionFactory = FactoryProducer.GetFactory("server");
		
	    ConeccionFactory cf = new ConeccionFactory(); 
	    
		Coneccion server1 = cf.getConeccion("server1");
		server1.coneccion();
		
		Coneccion server2 = cf.getConeccion("server2");
		server2.coneccion();
		
		Coneccion server3 = cf.getConeccion("server3");
		server3.coneccion();
		
		AccionFactory cfa = new AccionFactory();
		
		Accion accion1 = cfa.getAccion("Select") ;
		accion1.accion();
		
		Accion accion2 = cfa.getAccion("Set") ;
		accion2.accion();
		
		Accion accion3 = cfa.getAccion("Update") ;
		accion3.accion();
	}
	
}
