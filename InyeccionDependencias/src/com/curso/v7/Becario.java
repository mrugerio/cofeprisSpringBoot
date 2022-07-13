package com.curso.v7;

public class Becario {

	String nombre;
	Pc myPc; //Inyectar por Atributo o Variable

	
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
