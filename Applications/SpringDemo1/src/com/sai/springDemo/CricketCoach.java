package com.sai.springDemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneservice;
	private String EmailAdress;
	private String Team;
	
	

	public CricketCoach() {
		System.out.println("Inside constructor of CricetCoach");
	}
	
	

	public void setFortuneservice(FortuneService fortuneservice) {
		System.out.println("Inside setter of fortune service of cricketCoach");
		this.fortuneservice = fortuneservice;
	}
	
	

	public String getEmailAdress() {
		return EmailAdress;
	}



	public void setEmailAdress(String emailAdress) {
		System.out.println("Inside setter of Email Address of cricketCoach");
		EmailAdress = emailAdress;
	}



	public String getTeam() {
		return Team;
	}



	public void setTeam(String team) {
		System.out.println("Inside setter of team of cricketCoach");
		Team = team;
	}



	@Override
	public String getDailyWorkout() {
		return "Parctice Fast bowling for 15mins";
	}

	@Override
	public String getDailyFortune() {
		return "playing cricket" + fortuneservice.getFortune();
	}

}
