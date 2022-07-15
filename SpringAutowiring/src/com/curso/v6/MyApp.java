package com.curso.v6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		//CONFIGURACION POR CLASES JAVA
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);

		Coach theCoach1 = context.getBean("getCoach1", Coach.class);
		
		System.out.println(theCoach1.getDailyWorkout());
		
		System.out.println(theCoach1.getDailyFortune());
		
		Coach theCoach2 = context.getBean("getCoach2", Coach.class);
		
		System.out.println(theCoach2.getDailyWorkout());
		
		System.out.println(theCoach2.getDailyFortune());
				
		
	}
	
	

}
