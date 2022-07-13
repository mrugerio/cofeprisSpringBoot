package com.curso.v9;

public class Principal {

	public static void main(String[] args) {

		Becario becario1 = Inyector.getBecario("Patrobas","Windows");
						
		becario1.encenderPcBecario();
		
		Becario becario2 = Inyector.getBecario("Tercio","Linux");
		
		becario2.encenderPcBecario();
	}

}
