package com.curso.v6;

public class Principal {

	public static void main(String[] args) {

		Becario becario1 = new Becario("Patrobas");
		
		Inyector.inyectarPcWindows(becario1);
				
		becario1.encenderPcBecario();
		
		Becario becario2 = new Becario("Tercio");
		
		Inyector.inyectarPcLinux(becario2);

		becario2.encenderPcBecario();
	}

}
