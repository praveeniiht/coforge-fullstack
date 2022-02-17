package com.example.coforge.microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.coforge.microservices.beans.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsConfiguration() {
		
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
		
	}

}
