package org.globant.topic3.ex02;

public class CrudFactory {
	private CrudFactory() {}  
	  
    public static CrudService getLocalService(){  
        return new CrudServiceImp ();  
    }  
  

}
