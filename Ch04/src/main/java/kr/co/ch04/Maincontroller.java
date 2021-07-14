package kr.co.ch04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/* controller = 의미를 갖는 annotation*/
@Controller 

public class Maincontroller {
	
	/* 처음 시작 주소를 index로 만드는 과정*/
	@RequestMapping(value = {"/", "/index"})
	public String index() {
		return "index";
	}
	

	@GetMapping("/hello")
	public String hello() {
		return "hello"; 
		/*ViewResolver = controller에서 return되는 jsp 앞뒤에 자동으로 경로와 확장자 붙여줌 -> 뒤에 확장자 쓸필요없음*/
	}
	
	@GetMapping("/greeting")
	public String greeting() {
		return "greeting"; 
		
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome"; 
		
	}
	
}
