package com.curso.v8;

public class Becario {

	private String nombre;
	private Pc myPc; //Inyectar Setter


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
	
	public void setMyPc(Pc myPc) {
		//Cientos validaciones
		this.myPc = myPc;
	}
	
	
}
