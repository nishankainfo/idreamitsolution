package com.idream.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IdreamController {

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String index(ModelMap model) {
		return "login";
	}
}
