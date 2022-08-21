package com.junhyeok.webServer;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.junhyeok.service.UserService;

@Controller
@RequestMapping("/user/*")
public class UserController {
	
//	@Inject
//	private UserService service;
//	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public void readAll(Model model) throws Exception {
//		System.out.println("~~~~~~");
//	}

//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public void readAll(@RequestParam("pillSeq")) throws Exception {
//		
//	}
}
