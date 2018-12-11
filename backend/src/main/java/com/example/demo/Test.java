package com.example.demo;
import org.springframework.web.bind.annotation.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Test {
    
    @RequestMapping("/stuff")
	public String home(){
		return "Hello World";
	}

	 @RequestMapping("/")
	public String home1(){
		return "Hello World1";
	}
}