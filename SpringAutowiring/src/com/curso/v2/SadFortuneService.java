package com.curso.v2;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Hoy no es quincena!";
	}

}
