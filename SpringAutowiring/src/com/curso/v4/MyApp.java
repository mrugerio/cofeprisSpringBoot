package com.curso.v4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		//CONFIGURACION ANOTACIONES
		//TAMBIEN MOSTRAR CONCEPTO DE POLIMORFISMO
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContextV4.xml");
				
		Coach theCoach1 =  context.getBean("trackCoach", Coach.class);
		Coach theCoach2 =  context.getBean("baseballCoach", Coach.class);
		
		List<Coach> listaCoachs= new ArrayList<>();
		listaCoachs.add(context.getBean("tenisCoach", Coach.class));
		listaCoachs.add(theCoach1);
		listaCoachs.add(theCoach2);
		
		entrenar(listaCoachs);
	}
	
	static void entrenar(List<Coach> lista) {
		for (Coach c:lista) {
			//Polimorfismo
			System.out.println(c.getClass().getSimpleName());
			System.out.println(c.getDailyWorkout());
			System.out.println(c.getDailyFortune());		
			System.out.println("------------");
		}
	}
	

}
