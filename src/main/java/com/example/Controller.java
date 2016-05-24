package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/acutuator")
public class Controller {

	@RequestMapping(value="/go",  method=RequestMethod.GET)
	public String helloWorld(){
		return "Hello World";
	}
	
	
}
