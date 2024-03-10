package com.in28minutes.learnspringaop.aopexample.business;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in28minutes.learnspringaop.aopexample.data.DataService1;

@Service
public class BusinessService1 {

	@Autowired
	private DataService1 dataService1;
	
	public int calculateMax() {
		int[] data = dataService1.retrieveData();
		return Arrays.stream(data).max().orElse(0);
	}
	
	//Business Logic
	// Data needs
}