package com.sonar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SonarController {

	@GetMapping("/sonarTest")
	public String test() {
		if(false) {
			System.out.println("test");
			m1();
		}
		return "Hello World";
	}

	private void m1() {
		System.out.print("method m1");
	}
}
