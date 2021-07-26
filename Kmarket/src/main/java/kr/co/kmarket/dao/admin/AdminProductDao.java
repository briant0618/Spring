package kr.co.kmarket.dao.admin;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.kmarket.vo.Cate1VO;
import kr.co.kmarket.vo.Cate2VO;
import kr.co.kmarket.vo.ProductVO;

@Repository
public interface AdminProductDao {
		
	public void insertProduct(ProductVO vo);
	public ProductVO selectProduct();
	public List<ProductVO> selectProducts();
	public void updateProduct(ProductVO vo);
	public void deleteProduct(ProductVO vo);
	
	// 1차 카테고리 가져오기
	public List<Cate1VO> selectCate1();
	
	// 2차[상품] 카테고리 가져오기
	public List<Cate2VO> selectCate2(int cate1);  // code1이 cate1의 정보를 가져와야하기때문에 int cate1 받아옴
}
