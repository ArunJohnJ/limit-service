package com.microservice.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.limitsservice.configuration.LimitsConfiguration;
import com.microservice.limitsservice.model.Limits;

@RestController
@RequestMapping("/limits")
public class LimitsController {
	
	@Autowired
	private LimitsConfiguration configuration;

	@GetMapping
	public Limits retrieveLimits() {
//		return new Limits(1, 1000);
		return new Limits(configuration.getMinimum(),configuration.getMaximum());
	}

}
