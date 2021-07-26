package kr.co.kmarket.controller.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.kmarket.vo.Cate1VO;
import kr.co.kmarket.vo.Cate2VO;
import kr.co.kmarket.vo.ProductVO;
import kr.co.kmarket.service.admin.AdminProductService;

@Controller
public class AdminProductController {

	@Autowired
	private AdminProductService service;
	
	@GetMapping("/admin/product/list")
	public String list() {
		return "/admin/product/list";
	}
	
	@GetMapping("/admin/product/register")
	public String register() {
		return "/admin/product/register";
	}
	
	@PostMapping("/admin/product/register") // 상품등록의 기본정보들 전송
	public String register(ProductVO vo, HttpServletRequest req) {
		
		String ip = req.getRemoteAddr();
		vo.setIp(ip);
		
		//첨부파일 업로드
		ProductVO pvo = service.uploadThumb(vo); // pvo안에 썸네일 이름이 있엉 (uName) -> 이제 km_product에 insert하면 끝
		
		// 상품정보를 테이블에 저장
		service.insertProduct(pvo);
		
		return "redirect:/admin/product/register";
	}
	
	
	
	@ResponseBody
	@GetMapping("/admin/product/getCate1")
	public List<Cate1VO> getCate1() {
		List<Cate1VO> cate1s = service.selectCate1();
		return cate1s;		
	}
	
	@ResponseBody
	@GetMapping("/admin/product/getCate2")
	public List<Cate2VO> getCate2(int cate1) {
		
		List<Cate2VO> cate2s = service.selectCate2(cate1);
		return cate2s;	
	}
	
	
}
