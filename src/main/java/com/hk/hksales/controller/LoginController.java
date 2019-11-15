package com.hk.hksales.controller;

import java.util.Map;

import com.hk.hksales.dto.login.LoginRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@RequestMapping("/")
	public String loginPage(Map<String, Object> model) {
		model.put("message", this.message);
		return "/login";
	}
	@PostMapping("/login")
	public String login(@ModelAttribute LoginRequest loginRequest) {
		return "productList";
	}

}