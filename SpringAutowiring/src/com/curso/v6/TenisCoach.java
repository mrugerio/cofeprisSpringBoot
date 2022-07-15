package com.curso.v6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class TenisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TenisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes con la raqueta";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}








