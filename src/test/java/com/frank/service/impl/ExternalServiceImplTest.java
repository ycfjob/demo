package com.frank.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.frank.service.ExternalService;

import lombok.extern.apachecommons.CommonsLog;

/**
 * ExternalServiceImpl UT
 */
@CommonsLog
@SpringBootTest
public class ExternalServiceImplTest {
	
	@Autowired
	private ExternalService externalService;

	@Test
	public void 應該可以呼叫doSth_使用邏輯A() {
		log.info("=== 應該可以呼叫doSth_使用邏輯A start ===");
		/**
		 * 1. init
		 */
		final String option = "A";
		final String expectedResult = "AA";
		/**
		 * 2. Trigger
		 */
		final String result = externalService.doSth(option);
		/**
		 * 3. Validate
		 */
		assertEquals(expectedResult, result);
		log.info("=== 應該可以呼叫doSth_使用邏輯A end ===");
	}

	@Test
	public void 應該可以呼叫doSth_使用邏輯B() {
		log.info("=== 應該可以呼叫doSth_使用邏輯B start ===");
		/**
		 * 1. init
		 */
		final String option = "B";
		final String expectedResult = "AB";
		//final String expectedResult = "AA"; //ng

		/**
		 * 2. Trigger
		 */
		final String result = externalService.doSth(option);
		/**
		 * 3. Validate
		 */
		assertEquals(expectedResult, result);
		log.info("=== 應該可以呼叫doSth_使用邏輯B end ===");
	}

}
