package com.solinvictus.DemoSpringMVC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan
@SpringBootApplication
@EnableWebMvc
@EnableAutoConfiguration
public class DemoAppMain {
	
	public static void main(String args[]) {
		SpringApplication.run(DemoAppMain.class, args);
	}
}
