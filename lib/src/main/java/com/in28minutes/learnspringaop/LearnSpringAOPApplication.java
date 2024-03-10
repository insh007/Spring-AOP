package com.in28minutes.learnspringaop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.learnspringaop.aopexample.business.BusinessService1;

@SpringBootApplication
public class LearnSpringAOPApplication implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	//instead of using constructor we can also use Autowired annotation
	@Autowired
	private BusinessService1 businessService1;
	
	// Autowired using constructor 
//	public LearnSpringAOPApplication(BusinessService1 businessService1) {
//		this.businessService1 = businessService1;
//	}
	
	public static void main(String[] args) {
		SpringApplication.run(LearnSpringAOPApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Value returned is {}", businessService1.calculateMax());	
	}

}
