package com.curso.v8;

public class PcDummy implements Pc  {
	
	String version;

	public PcDummy(String version) {
		this.version = version;
	}
	
	public void encender() {
		System.out.println("Encender Pc Dummy :" +version);
	}

}
