package com.rokonoid.airport.apps.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home/*")
public class HomeController {

	@RequestMapping(value = "index", method = RequestMethod.GET)
	public void index() {
	}
	
	@RequestMapping(value = "about", method = RequestMethod.GET)
	public void about() {
	}
}
