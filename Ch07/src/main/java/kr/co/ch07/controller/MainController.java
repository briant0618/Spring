package kr.co.ch07.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.ch07.vo.UserVO;

@Controller
public class MainController {
	
	@GetMapping(value={"/","/index"})
	
	public String index(Model model) {
		
		String title = "SpringBoot Thymeleaf 연습하기";
		String hello = "HelloThymeleaf";
		
		UserVO user = new UserVO();
		user.setUid("a101");
		user.setName("Hong");
		user.setHp("010-1234-1034");
		user.setAge(21);
		
		
		List<UserVO> users = new ArrayList<>();
		
		users.add(new UserVO("a101","김유신","010-1234-1064",21));
		users.add(new UserVO("a102","김춘추","010-1234-1054",22));
		users.add(new UserVO("a103","장보고","010-1234-1074",23));
		users.add(new UserVO("a104","강감찬","010-1234-1094",24));
		users.add(new UserVO("a105","이순신","010-1234-1015",25));
		
		
		model.addAttribute("title", title);
		model.addAttribute("hello", hello);
		model.addAttribute("user", user);
		model.addAttribute("users", users);
		
		return "/index";
	}
	
	// include 함수 만들기 [ a태그 클릭시 include함수 실행 ]
	
	@GetMapping("/include")
	public String include() {
		return "/include";
	}
	
}
