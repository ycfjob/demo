package com.frank.service.impl;

import org.springframework.stereotype.Service;

import com.frank.service.ExternalService;

import lombok.extern.apachecommons.CommonsLog;

/**
 * External service 介面實作
 * 
 * @author Frank Yeh
 * @Date 2024-4-30
 */
@CommonsLog
@Service
public class ExternalServiceImpl implements ExternalService {

	@Override
	public String doSth(final String option) {
		log.info("=== doSth start ===");
		String result;
		if ("A".equals(option)) {
			result = doAAlogic();
		} else {
			result = doABlogic();
		}

		log.info("=== doSth end ===");
		return result;
	}

	/**
	 * DO AA logic
	 */
	private String doAAlogic() {
		//do sth 
		return "AA";
	}

	/**
	 * DO AB logic
	 */
	private String doABlogic() {
		//do sth 
		return "AB";
	}

}
