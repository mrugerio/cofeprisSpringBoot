package com.curso.v8;

public class Principal {

	public static void main(String[] args) {

		Becario becario1 = new Becario("Patrobas");
		
		Inyector.inyectarPcLinux(becario1);
				
		becario1.encenderPcBecario();
		
		Becario becario2 = new Becario("Tercio");
		
		Inyector.inyectarPcDummy(becario2);

		becario2.encenderPcBecario();
	}

}
