package com.curso.v6;

public class PcLinux implements Pc {
	
	String version;

	public PcLinux(String version) {
		this.version = version;
	}
	
	public void encender() {
		System.out.println("Encender :" +version);
	}

}
