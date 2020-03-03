package com.vishal.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@GetMapping("/")
	public String getMessage() {
		return "vishal project";
	}

}
