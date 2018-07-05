package br.com.gtsapplications.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//https://www.youtube.com/watch?v=PSP1-2cN7vM
//http://www.springboottutorial.com/spring-boot-tutorials-for-beginners
//https://github.com/in28minutes/SpringBootForBeginners/blob/master/Step01.md

@RestController
public class WelcomeController {

	@RequestMapping("/welcome")
	public String welcome() {
		return "Learning SpringBoot";
		
	}
}

