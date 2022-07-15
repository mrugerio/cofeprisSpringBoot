package com.curso.v4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TenisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired
	public TenisCoach( @Qualifier("happyFortuneService")
			              FortuneService theFortuneService) {
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








