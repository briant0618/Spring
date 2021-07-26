package kr.co.kmarket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.kmarket.dao.ShopDao;
import kr.co.kmarket.vo.ProductVO;

@Service
public class ShopService {

	@Autowired
	private ShopDao dao;
	
	public void insertProduct(ProductVO vo) {}
	public ProductVO selectProduct(int code) {
		return dao.selectProduct(code);
	}
	public List<ProductVO> selectProducts(int cate1, int cate2, String sort) {
		return dao.selectProducts(cate1, cate2, sort);
	}
	
	public ProductVO selectTitles(int cate1, int cate2) {
		return dao.selectTitles(cate1, cate2);
	}
	
	
	public void updateProduct(int code) {}
	public void deleteProduct(int code) {}
}