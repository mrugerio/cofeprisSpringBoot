package com.curso.v6;

public class Inyector {
	
	static void inyectarPcLinux(Becario becario) {
		becario.myPc = new PcLinux("Ubuntu 18.04");
	}

	static void inyectarPcWindows(Becario becario) {
		becario.myPc = new PcWindows("Windows Xp");
	}
}
