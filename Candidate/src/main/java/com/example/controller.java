package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	@RequestMapping("/")
	public String dwivedi() {
		return "helloo Ankit kumar dwivedi ";
		
	}
}
