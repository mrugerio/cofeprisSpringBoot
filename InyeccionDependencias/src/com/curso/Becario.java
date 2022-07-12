package com.curso;

public class Becario {

	String nombre;
	PcLinux myPc;
	
	public Becario(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Becario [nombre=" + nombre + "]";
	}
	
	public void encenderPcBecario() {
		System.out.println(nombre);
		myPc = new PcLinux("Ubuntu 18.04");
		myPc.encender();
	}
	
}
