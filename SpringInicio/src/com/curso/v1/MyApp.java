package com.curso.v1;

public class MyApp {

	public static void main(String[] args) {
		
		Coach theCoach1 = new TrackCoach();
		
		System.out.println(theCoach1.getDailyWorkout());
		
		Coach theCoach2 = new BaseballCoach();
		
		System.out.println(theCoach2.getDailyWorkout());
		

	}

}
