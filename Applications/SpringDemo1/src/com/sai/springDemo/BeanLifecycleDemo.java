package com.sai.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BeanLifecycleDemo {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("beanlifecycle.XML");
		
		TrackCoach myCoach =  context1.getBean("myCoach", TrackCoach.class);
		
		context1.close();
		
		

	}

}
