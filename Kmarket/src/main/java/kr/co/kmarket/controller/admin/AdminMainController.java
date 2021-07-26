package kr.co.kmarket.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


// Admin은 한개의 페이지로 관리하기엔 너무 많은 기능을 담고있어서 따로 admin Controller를 세분화하여 controller를 따로둔다.
// 수업에서는 상품관리만 하지만 나머지는 내가 한번 해봐야겟다.

@Controller
public class AdminMainController {
	
	@GetMapping(value={"admin","/admin/index"}) // 관리자 페이지
	public String index() {
		return "/admin/index";
	}
	
}
