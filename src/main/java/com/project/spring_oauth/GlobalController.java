package com.project.spring_oauth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GlobalController {
	
	@GetMapping("/greet")
	public String greetClient() {
		return "Hello Welcome To the Session of OAuth2 Client";
	}

}
