package com.curso.v7;

public class Inyector {
	
	static void inyectarPcLinux(Becario becario) {
		//Inyectar por Atributo o Variable
		becario.myPc = new PcLinux("Ubuntu 18.04");
	}

	static void inyectarPcWindows(Becario becario) {
		becario.myPc = new PcWindows("Windows Xp");
	}
	
	static void inyectarPcDummy(Becario becario) {
		becario.myPc = new PcDummy("Pruebas Unitarias");
	}
}
