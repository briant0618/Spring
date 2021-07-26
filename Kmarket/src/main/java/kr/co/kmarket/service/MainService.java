package kr.co.kmarket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.kmarket.dao.MainDao;
import kr.co.kmarket.vo.CategoriesVO;
import kr.co.kmarket.vo.ProductVO;

@Service
public class MainService {
	
	
	@Autowired
	private MainDao dao;
	
	public List<CategoriesVO> selectCategories(){
		return dao.selectCategories();
	}
	
	public List<ProductVO> selectHitProduct(){
		return dao.selectHitProduct();
	}
	
	public List<ProductVO> selectRecommendProduct(){
		return dao.selectRecommendProduct();
	}
	
	public List<ProductVO> selectLatestProduct(){
		return dao.selectLatestProduct();
	}
	
	public List<ProductVO> selectDiscountProduct(){
		return dao.selectDiscountProduct();
	}
	
}