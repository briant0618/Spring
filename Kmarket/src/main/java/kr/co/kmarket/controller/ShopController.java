package kr.co.kmarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.kmarket.service.ShopService;
import kr.co.kmarket.vo.ProductVO;

@Controller
public class ShopController {

	
	@Autowired
	private ShopService service;
	
	@GetMapping("/shop/cart")
	public String cart() {
		return "/shop/cart";
	}
	
	@GetMapping("/shop/list")
	public String list(Model model, int cate1, int cate2, String sort) {
		
		
		ProductVO titles = service.selectTitles(cate1, cate2);
		List<ProductVO> products = service.selectProducts(cate1, cate2, sort);
		
	
		model.addAttribute("titles",titles);
		model.addAttribute("cate1",cate1);
		model.addAttribute("cate2",cate2); // list에서 정렬할때 참조하기 위해서 model 객체로 attribute함
		model.addAttribute("products", products);
		
		return "/shop/list";
	}
	
	@GetMapping("/shop/order")
	public String order() {
		return "/shop/order";
	}
	
	@GetMapping("/shop/order-complete")
	public String orderComplete() {
		return "/shop/order-complete";
	}
	
	@GetMapping("/shop/search")
	public String search() {
		return "/shop/search";
	}
	
	@GetMapping("/shop/view")
	public String view() {
		return "/shop/view";
	}
	
}