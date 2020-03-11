package com.example.demo.bean;

import java.util.List;
import java.util.Set;


public class AnimalGroupTO {
	
	private Integer id;
	private String animalGroupNumber;
	private String type;
	private List<Test> tests;
	private Set<AddressTO> addresses;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAnimalGroupNumber() {
		return animalGroupNumber;
	}
	public void setAnimalGroupNumber(String animalGroupNumber) {
		this.animalGroupNumber = animalGroupNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	public List<Test> getTests() {
		return tests;
	}
	public void setTests(List<Test> tests) {
		this.tests = tests;
	}
	
	
	public Set<AddressTO> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<AddressTO> addresses) {
		this.addresses = addresses;
	}


}
