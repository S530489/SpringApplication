package com.sai.springDemo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.XML");
		
		System.out.println("after cotextpath");
		
		// retrieve bean from spring container
		Coach myCoach = context.getBean("myCoach", Coach.class);
		Fortunes fortune = context.getBean("myFortune", Fortunes.class);
		
		
		// call methods on the bean
		System.out.println(myCoach.getDailyWorkout());
		
		System.out.println(myCoach.getDailyFortune());
		
		System.out.println(fortune.getFortune());
	
		// close the context
		context.close();
		
	}

}







