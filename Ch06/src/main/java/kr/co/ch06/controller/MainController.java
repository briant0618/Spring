package kr.co.ch06.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping(value={"/","/hello"})
	public String hello() {
		return "/hello";
	}
	
	@GetMapping("/welcome")
	
	public String welcome() {
		return "/welcome";
	}
}
