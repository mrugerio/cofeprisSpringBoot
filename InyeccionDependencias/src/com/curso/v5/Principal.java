package com.curso.v5;

public class Principal {

	public static void main(String[] args) {

		Becario becario1 = new Becario("Patrobas");
		
		Inyector.inyectarPc(becario1);
				
		becario1.encenderPcBecario();
		
		Becario becario2 = new Becario("Tercio");
		
		Inyector.inyectarPc(becario2);

		becario2.encenderPcBecario();
	}

}
