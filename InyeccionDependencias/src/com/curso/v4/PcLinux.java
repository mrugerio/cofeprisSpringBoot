package com.curso.v4;

public class PcLinux extends Pc {
	
	String version;

	public PcLinux(String version) {
		this.version = version;
	}
	
	public void encender() {
		System.out.println("Encender :" +version);
	}

}
