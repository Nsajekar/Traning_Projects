package com.euronet.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("helloworldapi")
public class HelloWorldController {

	@RequestMapping(value = "message", method = RequestMethod.GET)
	public String printMessage() {
		return "Http get method";

	}
	@RequestMapping(value ="message",method = RequestMethod.POST)
	public String postMessage(){
		return "Http post method";
	}
	
	@RequestMapping(value ="message",method = RequestMethod.PUT)
	public String putMessage(){
		return "Http PUT method";
	}
	
	@RequestMapping(value ="message",method = RequestMethod.DELETE)
	public String deleteMessage(){
		return "Http delete method";
	}
	
	
}
