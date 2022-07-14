package com.curso.v4;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

}








