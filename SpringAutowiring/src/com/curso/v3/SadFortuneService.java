package com.curso.v3;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Hoy no es quincena!";
	}

}
