package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.bean.AnimalGroupTO;
import com.example.demo.bean.Test;

@RestController
public class AnimalTrackingService {
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public void createTest(@RequestBody Test test) {
	    this.restTemplate.postForObject("http://disease-control/create-test", test,Test.class);
	}
	
	@RequestMapping(value="create-animal-group", method=RequestMethod.POST)
	public void createAnimalGroup(@RequestBody AnimalGroupTO animalGroup) {
		this.restTemplate.postForObject("http://animal-group-registration/animal-group-registration", animalGroup, AnimalGroupTO.class);
	}
	
	@RequestMapping(value="get-test-Info/{test-id}", method = RequestMethod.GET)
	public Test getTest(@PathVariable("test-id") Integer testId){
		return this.restTemplate.getForObject("http://disease-control/test/"+testId, Test.class);
	}

}
