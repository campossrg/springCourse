package com.luv2code.spring.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funRestController {
	
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;

	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return "Coach: " + coachName + ", Team name: " + teamName;
	}
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World! Time on server is " + LocalDateTime.now();
	}
	
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run a hard 5k!";
	}
	
	@GetMapping("/fortune")
	public String getDailyFortune() {
		return "Today is youre lucky day";
	}
}
