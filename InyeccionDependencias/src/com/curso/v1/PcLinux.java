package com.curso.v1;

public class PcLinux {
	
	String version;

	public PcLinux(String version) {
		this.version = version;
	}
	
	public void encender() {
		System.out.println("Encender :" +version);
	}

}
