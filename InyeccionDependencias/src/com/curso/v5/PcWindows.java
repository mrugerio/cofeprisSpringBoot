package com.curso.v5;

public class PcWindows implements Pc  {
	
	String version;

	public PcWindows(String version) {
		this.version = version;
	}
	
	public void encender() {
		System.out.println("Encender :" +version);
	}

}
