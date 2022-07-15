package com.curso.v6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
	
	@Bean
	public FortuneService getFortuneService() {
		return new HappyFortuneService();
	}
	
	@Bean
	public FortuneService getOtroFortuneService() {
		return new RandomFortuneService();
	}
	
	@Bean
	public Coach getCoach1() {
		return new TrackCoach(getOtroFortuneService());
	}
	
	@Bean
	public Coach getCoach2() {
		return new BaseballCoach(getFortuneService());
	}
	
}
