package com.example.coforge.microservices;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("limits-service")
@Component
public class Configuration {
	
	
	int minimum;
	int maximum;
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMaximum() {
		return maximum;
	}
	
	

}
