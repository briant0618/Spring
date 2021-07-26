package kr.co.kmarket.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.kmarket.vo.ProductVO;

@Repository
public interface ShopDao {
	
	public void insertProduct(ProductVO vo);
	public ProductVO selectProduct(int code);
	public List<ProductVO> selectProducts(int cate1, int cate2, String sort);
	public ProductVO selectTitles(int cate1, int cate2);
	public void updateProduct(int code);
	public void deleteProduct(int code);
}
