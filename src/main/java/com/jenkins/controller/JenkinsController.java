package com.jenkins.controller;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class JenkinsController {

	Logger logger = LoggerFactory.getLogger(JenkinsController.class);
	
	@PostConstruct
	public init()
	{
		logger.info("Application Started.....");
		logger.info("Application Started for 2nd time.....");
	}
	
	@GetMapping("/jenkinsdata")
	public String jenkinCall()
	{
		logger.info("Application Executed.....");
		logger.info("Application Executed for 2nd time.....");
		System.out.println("jenkins called this API");
		return "Jenkin API Called";
	}
}
