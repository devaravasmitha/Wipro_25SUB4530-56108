package com.wip.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/hi")
	private String sayHi() {
		return "Success!!! Getting Message from TestController!";
	}
	@GetMapping("/")
    public String home() {
        return "Welcome! Your Azure Web App is working perfectly.";
    }
}




