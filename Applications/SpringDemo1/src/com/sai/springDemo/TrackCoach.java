package com.sai.springDemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneservice;
	
	
	public TrackCoach(FortuneService fortuneservice) {
		System.out.println("In constructor of TrackCoach");
		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it : "+fortuneservice.getFortune();
	}
	
	public void startingStuff() {
		System.out.println("init method");
	}
	
	public void destroyStuff() {
		System.out.println("destroy method");
	}
}










