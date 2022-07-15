package com.curso.v5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		//CONFIGURACION POR CLASES JAVA
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);

		Coach theCoach = context.getBean("tenisCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
				
		
	}
	
	

}
