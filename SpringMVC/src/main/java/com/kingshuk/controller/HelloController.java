package com.kingshuk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView sayHello(){
		ModelAndView mav=new ModelAndView("hello");
		mav.addObject("userName","kingshuk");
		return mav;
	}

}
