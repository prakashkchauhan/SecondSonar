package com.sonar.controller;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SonarControllerTest {

	private SonarController sonarController;
	
	@BeforeEach
	void setUp() throws Exception {
		sonarController = new SonarController();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testTest() {
		String name = sonarController.test();
		Assert.assertNotNull(name);
	}

}
