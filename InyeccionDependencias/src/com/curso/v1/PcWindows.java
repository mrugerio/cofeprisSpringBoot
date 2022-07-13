package com.curso.v1;

public class PcWindows {
	
	String version;

	public PcWindows(String version) {
		this.version = version;
	}
	
	public void encender() {
		System.out.println("Encender :" +version);
	}

}
