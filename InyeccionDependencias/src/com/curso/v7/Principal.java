package com.curso.v7;

public class Principal {

	public static void main(String[] args) {

		Becario becario1 = new Becario("Patrobas");
		
		Inyector.inyectarPcDummy(becario1);
				
		becario1.encenderPcBecario();
		
		Becario becario2 = new Becario("Tercio");
		
		Inyector.inyectarPcDummy(becario2);

		becario2.encenderPcBecario();
	}

}
