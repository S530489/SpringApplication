package com.sai.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SetterInjectionDemo {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext.XML");
		
		CricketCoach myCoach =  context1.getBean("myCricketCoach", CricketCoach.class);
		
		System.out.println(myCoach.getDailyWorkout());
		
		System.out.println(myCoach.getDailyFortune());
		
		System.out.println(myCoach.getEmailAdress());
		
		System.out.println(myCoach.getTeam());	
		
		CricketCoach myCoach1 =  context1.getBean("myCricketCoach", CricketCoach.class);
		
		System.out.println(myCoach==myCoach1);
		context1.close();

	}

}
