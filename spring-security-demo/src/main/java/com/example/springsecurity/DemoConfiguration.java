package com.example.springsecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;



@EnableWebSecurity
public class DemoConfiguration extends WebSecurityConfigurerAdapter{
	
	 // Adding the roles
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    	auth.inMemoryAuthentication()
    		.withUser("praveen")
    		.password("12345")
    		.roles("user")
    		.and()
    		.withUser("kishore")
    		.password("7890")
    		.roles("admin");
    		
    }
    
   
  
    // Configuring the api
    // according to the roles.
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	
    	http
    	.httpBasic()
    	.and()
    	.authorizeRequests()
    	.antMatchers("/user").hasAnyRole("user","admin")
    	.antMatchers("/admin").hasRole("admin")
    	.and()
    	.formLogin();
    	
    	
    	/*
    	 http.
         httpBasic()
         .and()
         .authorizeRequests()
         .antMatchers("/admin/**").hasRole("admin")
         .antMatchers("/testcustomer").hasAnyRole("admin","customer","manager")
         .antMatchers("/manager/**").hasRole("manager")
         .and()
         .formLogin();
         */
    	
    	
       
    }
    
    @Bean
    public PasswordEncoder getPasswordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }

}
