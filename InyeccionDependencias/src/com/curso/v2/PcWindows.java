package com.curso.v2;

public class PcWindows  extends Pc  {
	
	String version;

	public PcWindows(String version) {
		this.version = version;
	}
	
	public void encender() {
		System.out.println("Encender :" +version);
	}

}
