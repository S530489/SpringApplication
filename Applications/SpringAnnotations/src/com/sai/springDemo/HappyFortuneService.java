package com.sai.springDemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	public HappyFortuneService() {
		System.out.println("in costrcutorn of happy fortune service");
	}
	@Override
	public String getDailyFortune() {
		return "today is my lucky day";
	}

}
