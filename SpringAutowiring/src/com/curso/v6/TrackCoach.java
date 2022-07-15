package com.curso.v6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	@Autowired
	public TrackCoach( @Qualifier("sadFortuneService")
			           FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}










