package com.curso.v3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		//CONFIGURACION XML
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContextV3.xml");
				
		Coach theCoach1 =  context.getBean("trackCoach", Coach.class);
		
		System.out.println(theCoach1.getDailyWorkout());
		
		System.out.println(theCoach1.getDailyFortune());

	}

}
