package com.frank.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.apachecommons.CommonsLog;

/**
 * Demo controller
 * 
 * @author Frank Yeh
 * @Date 2024-4-30
 */
@CommonsLog
@RestController
@RequestMapping("/config")
public class ConfigController {
	
	
	@Value("${env}")
	private String env;
	
	
	@GetMapping("/env")
	public String getEvn() {
		log.info("Env : "+ env);
		return this.env;
	}

}
