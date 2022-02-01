package com.simplilearn.JenkinsCICD;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsCicdApplication {
	
	public static Logger logger = LoggerFactory.getLogger(JenkinsCicdApplication.class);
	
	@PostConstruct
	public void intt() {
		logger.info("Application started...");
	}


	public static void main(String[] args) {
		logger.info("Application executed...");
		SpringApplication.run(JenkinsCicdApplication.class, args);
	}

}
