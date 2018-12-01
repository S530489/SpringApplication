package com.sai.springDemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneservice;
	
	
	
	public BaseballCoach(FortuneService fortuneservice) {
		this.fortuneservice = fortuneservice;
		System.out.println("In constructor of Baseball");
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}
	
	

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortune();
	}
	
}








