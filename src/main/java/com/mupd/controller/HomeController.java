package com.mupd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Vassil Vassilev
 *
 */
@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "MUPD Test Project";
	}

}
