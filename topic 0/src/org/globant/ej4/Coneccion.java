package org.globant.ej4;

public class Coneccion {
	private String db;
	private String consulta1;
	private String consulta2;
	
	public String getDb() {
		return db;
	}
	public void setDb(String db) {
		this.db = db;
	}
	public String getConsulta1() {
		return consulta1;
	}
	public void setConsulta1(String consulta1) {
		this.consulta1 = consulta1;
	}
	public String getConsulta2() {
		return consulta2;
	}
	public void setConsulta2(String consulta2) {
		this.consulta2 = consulta2;
	}
	
	public String toString(){
		return "base de datos:"+ db + ", consulta 1:"+ consulta1+ ",consulta 2:" +consulta2;
	}
		
	
	
}
