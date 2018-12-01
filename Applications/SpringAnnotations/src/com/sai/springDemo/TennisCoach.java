package com.sai.springDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("tennisCoach")
@Scope("singleton")
public class TennisCoach implements Coach {
	
	
//	@Autowired
//	@Qualifier("happyFortuneService")
	private FortuneService fortuneservice;
	
	@Value("${foo.email}")
	private String Email;
	
	@Value("${foo.team}")
	private String team;
	
	
	@Autowired
	 public TennisCoach(@Qualifier("dataFortuneService") FortuneService fortuneService1) {
		System.out.println("Inside constructor of coach");
		this.fortuneservice=fortuneService1;
		System.out.println(fortuneservice.getDailyFortune());
	}

	
	public TennisCoach() {
		System.out.println("In constructor of tennis coach");
	}
	
	/*
	@Autowired
	public void setFortuneservice(FortuneService fortuneservice) {
		System.out.println("in method");
		this.fortuneservice = fortuneservice;
	}
	*/
	
	@PostConstruct
	public void starmethod() {
		 System.out.println("init method");
	}
	
	@PreDestroy
	public void Destroymethod() {
		System.out.println("destroy method");
	}
	
	@Override
	public String getDailyWorkout() {
		return "practice backhand shot";
	}

	

	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}


	@Override
	public String getDailyFortune() {
		
		return fortuneservice.getDailyFortune();
	}

}
