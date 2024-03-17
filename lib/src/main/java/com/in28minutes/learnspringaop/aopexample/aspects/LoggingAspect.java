package com.in28minutes.learnspringaop.aopexample.aspects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

//Configuration class
//Which contains AOP Configuration

@Configuration
@Aspect
public class LoggingAspect {
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	// Pointcut - When to do?
	// execution(* PACKAGE.*.*(..)) 
	@Pointcut("")
	public void logMethodCall() {
		// Logic - What to do?
		logger.info("Method is called - ");
	}

}
