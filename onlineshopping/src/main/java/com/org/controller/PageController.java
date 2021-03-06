package com.org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {

		ModelAndView modelAndView = new ModelAndView("page");

		modelAndView.addObject("greeting", "Welcome to spring Web MVC");

		return modelAndView;
	}
	/*
	 * @RequestMapping(value = "/test") public ModelAndView
	 * test(@RequestParam(value="greeting",required=false) String greeting) {
	 * 
	 * 
	 * if(greeting ==null) {
	 * 
	 * 
	 * greeting="Hello Greeting";
	 * 
	 * 
	 * }
	 * 
	 * 
	 * 
	 * ModelAndView modelAndView = new ModelAndView("page");
	 * 
	 * modelAndView.addObject("greeting", greeting);
	 * 
	 * return modelAndView;
	 * 
	 * }
	 */

	/*
	 * @RequestMapping(value = "/test/{greeting}") public ModelAndView
	 * test(@PathVariable(value="greeting",required=false) String greeting) {
	 * 
	 * 
	 * if(greeting ==null) {
	 * 
	 * 
	 * greeting="Hello Greeting";
	 * 
	 * 
	 * }
	 * 
	 * 
	 * 
	 * ModelAndView modelAndView = new ModelAndView("page");
	 * 
	 * modelAndView.addObject("greeting", greeting);
	 * 
	 * return modelAndView;
	 * 
	 * }
	 */
}
