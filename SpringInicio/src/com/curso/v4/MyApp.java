package com.curso.v4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);

		Coach theCoach1 = context.getBean("tenisCoach", Coach.class);

		System.out.println(theCoach1.getDailyWorkout());

		Coach theCoach2 = context.getBean("baseballCoach", Coach.class);

		System.out.println(theCoach2.getDailyWorkout());

	}

}
