package kr.co.kmarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.kmarket.service.MainService;
import kr.co.kmarket.vo.CategoriesVO;
import kr.co.kmarket.vo.ProductVO;

@Controller
public class MainController {

	@Autowired
	private MainService service;
	
	@GetMapping(value={"", "/index"}) // DB에 있는 정보 뿌려야하기 때문에 value 사용!
	public String index(Model model) {
		
		List<ProductVO> productsHit = service.selectHitProduct();
		List<ProductVO> productsRecommend = service.selectRecommendProduct();
		
		model.addAttribute("productsHit", productsHit);
		model.addAttribute("productsRecommend", productsRecommend);
		
		return "/index";
	}
	
	
	
	
	
	// 
	@ResponseBody // @ResponseBody는 Json 받기위해 필요한 annotation이다.
	@GetMapping("/categories")
	public List<CategoriesVO> getCategories() {
		return service.selectCategories();
	}
	
	// 추천상품 + 할인상품 
	
	@ResponseBody
	@GetMapping("/getLatestProduct")
	public List<ProductVO> getLatestProduct() {
		
		return service.selectLatestProduct();
	}
	
	@ResponseBody
	@GetMapping("/getDiscountProduct")
	public List<ProductVO> getDiscountProduct() {
		return service.selectDiscountProduct();
	}
	
	
}