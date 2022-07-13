package com.curso.v5;

public class Inyector {
	
	static void inyectarPc(Becario becario) {
		becario.myPc = new PcLinux("Ubuntu 18.04");
	}

}
