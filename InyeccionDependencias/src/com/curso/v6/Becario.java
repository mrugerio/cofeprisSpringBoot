package com.curso.v6;

public class Becario {

	String nombre;
	Pc myPc;
	
	public Becario(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Becario [nombre=" + nombre + "]";
	}
	
	public void encenderPcBecario() {
		System.out.println(nombre);
		myPc.encender();
	}
	
}
