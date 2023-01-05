package com.codxdoc.springdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoRestController {
	
	// add (/hello) end-point
	@GetMapping("/hello")
	public String sayHello() {
		
		return "hello world from REST !!";
	}

}
