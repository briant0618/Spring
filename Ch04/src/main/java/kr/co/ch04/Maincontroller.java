package kr.co.ch04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/* controller = �ǹ̸� ���� annotation*/
@Controller 

public class Maincontroller {
	
	/* ó�� ���� �ּҸ� index�� ����� ����*/
	@RequestMapping(value = {"/", "/index"})
	public String index() {
		return "index";
	}
	

	@GetMapping("/hello")
	public String hello() {
		return "hello"; 
		/*ViewResolver = controller���� return�Ǵ� jsp �յڿ� �ڵ����� ��ο� Ȯ���� �ٿ��� -> �ڿ� Ȯ���� ���ʿ����*/
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
