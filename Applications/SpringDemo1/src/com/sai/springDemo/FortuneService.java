package com.sai.springDemo;

public class FortuneService implements Fortunes {
	
	 public FortuneService() {
		System.out.println("In construtor of Fortuneservice");
	}

	@Override
	public String getFortune() {
		
		return "Today is lucky day";
	}

}
