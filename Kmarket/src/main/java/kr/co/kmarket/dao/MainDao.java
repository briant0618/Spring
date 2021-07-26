package kr.co.kmarket.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.kmarket.vo.CategoriesVO;
import kr.co.kmarket.vo.ProductVO;

@Repository
public interface MainDao {

	public List<CategoriesVO> selectCategories();
	public List<ProductVO> selectHitProduct();
	public List<ProductVO> selectRecommendProduct();
	public List<ProductVO> selectLatestProduct();
	public List<ProductVO> selectDiscountProduct();
	
}
