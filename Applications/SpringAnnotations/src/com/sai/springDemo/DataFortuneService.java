package com.sai.springDemo;

import org.springframework.stereotype.Component;

@Component
public class DataFortuneService implements FortuneService {

	public DataFortuneService() {
		System.out.println("in costrcutorn of data fortune service");
	}
	@Override
	public String getDailyFortune() {
		
		return "get data from database";
	}

}
