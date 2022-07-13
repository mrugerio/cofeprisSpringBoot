package com.curso.v9;

public class Becario {

	private String nombre;
	private Pc myPc; //Inyectar por Constructor

	//Constructor
	public Becario(String nombre, Pc myPc ) {
		this.nombre = nombre;
		this.myPc = myPc;
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
