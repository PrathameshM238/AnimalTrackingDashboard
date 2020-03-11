package com.example.demo.bean;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;




@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class Test {
	private String testStatus;
	private String testType;
	private String animalGroupNumber;
	
	public Test() {
		
	}

	public String getTestStatus() {
		return testStatus;
	}

	public void setTestStatus(String testStatus) {
		this.testStatus = testStatus;
	}
	
	public String getTestType() {
		return testType;
	}

	public void setTestType(String testType) {
		this.testType = testType;
	}

	public String getAnimalGroupNumber() {
		return animalGroupNumber;
	}

	public void setAnimalGroupNumber(String animalGroupNumber) {
		this.animalGroupNumber = animalGroupNumber;
	}
	
	

	
}
