package com.senyume.security.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jigish Patel
 */

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello(){
		return "Hello Web Security!";
		
	}
}
