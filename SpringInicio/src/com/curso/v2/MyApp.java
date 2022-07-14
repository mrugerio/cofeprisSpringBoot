package com.curso.v2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		//CONFIGURACION XML
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContextV2.xml");
				
		Coach theCoach1 =  context.getBean("myEntrenador2", Coach.class);
		
		System.out.println(theCoach1.getDailyWorkout());
		
		Coach theCoach2 = context.getBean("myEntrenador1", Coach.class);
		
		System.out.println(theCoach2.getDailyWorkout());
		

	}

}
