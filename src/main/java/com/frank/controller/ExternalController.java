package com.frank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frank.service.ExternalService;

import lombok.extern.apachecommons.CommonsLog;

@CommonsLog
@RequestMapping("/external")
@RestController
public class ExternalController {
	
	@Autowired
	private ExternalService externalService;
	
	

}
