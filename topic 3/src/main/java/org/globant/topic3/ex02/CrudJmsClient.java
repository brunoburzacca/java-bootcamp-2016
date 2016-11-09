package org.globant.topic3.ex02;

public class CrudJmsClient implements CrudService{
	CrudService jmsObject;  
	  
	    public CrudJmsClient() {  
	        //jmsObject = code to get the reference to Service A from the jms call  
	    }  
	  
	    
	    public void create() {  
	        jmsObject.create();  
	    }  
	    
	    public void read() {  
	        jmsObject.read();  
	    }
	    public void update() {  
	        jmsObject.update();  
	    }
	    public void delete() {  
	        jmsObject.delete();  
	    }
	  
	  
}
