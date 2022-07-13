package com.curso.v9;

public class Inyector {
	
	static Becario getBecario(String nombre, String stringPc) {
		
		Pc pcLinux = new PcLinux("Ubuntu 18.04");
		Pc pcWindows = new PcWindows("Windows 10");
		
		Becario becario;
		
		//INYECTAR POR CONSTRUCTOR
		if (stringPc.equals("Windows"))
			 becario = new Becario(nombre,pcWindows);
		else 
			 becario = new Becario(nombre,pcLinux);
	
		return becario;
		
		
	}
	
	
}
