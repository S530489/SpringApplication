package com.sai.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		TennisCoach theCoach = (TennisCoach) context.getBean("tennisCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getEmail());
		
		System.out.println(theCoach.getTeam());
		context.close();

	}

}
