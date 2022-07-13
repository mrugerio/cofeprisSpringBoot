package com.curso.v8;

public class Inyector {
	
	static void inyectarPcLinux(Becario becario) {
		//Inyectar por Setter
		becario.setMyPc(new PcLinux("Ubuntu 18.04"));
	}

	static void inyectarPcWindows(Becario becario) {
		becario.setMyPc(new PcWindows("Windows Xp"));

	}
	
	static void inyectarPcDummy(Becario becario) {
		becario.setMyPc(new PcDummy("Pruebas Unitarias"));
	}
}
