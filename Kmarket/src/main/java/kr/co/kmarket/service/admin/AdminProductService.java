  
package kr.co.kmarket.service.admin;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kr.co.kmarket.dao.admin.AdminProductDao;
import kr.co.kmarket.vo.Cate1VO;
import kr.co.kmarket.vo.Cate2VO;
import kr.co.kmarket.vo.ProductVO;

@Service
public class AdminProductService {
	
	@Autowired
	private AdminProductDao dao;
	
	public void insertProduct(ProductVO vo) {
		dao.insertProduct(vo);
	}
	
	public ProductVO selectProduct() {
		return null;
	}
	public List<ProductVO> selectProducts() {
		return null;
	}
	public void updateProduct(ProductVO vo) {}
	public void deleteProduct(ProductVO vo) {}
	
	// 1차 카테고리 가져오기
	public List<Cate1VO> selectCate1() {
		return dao.selectCate1();
	}
	
	// 2차 카테고리 가져오기
	public List<Cate2VO> selectCate2(int cate1) {
		return dao.selectCate2(cate1);
	}
	
	// 상품 이미지 업로드 함수
	public ProductVO uploadThumb(ProductVO vo) {
		
		File file = new File("src/main/resources/static/thumb/");
		String path = file.getAbsolutePath(); // 서버상 경로	
		
		MultipartFile[] files = {	vo.getFile1(),
									vo.getFile2(),
									vo.getFile3(),
									vo.getFile4()  };
		
		for(int i=0 ; i<files.length ; i++) {
			MultipartFile mf = files[i];
			
			if(!mf.isEmpty()) {
				// 파일을 첨부했을 경우 -> 앞에 느낌표 = Not[한번더 확인]
				String name = mf.getOriginalFilename();
				String ext = name.substring(name.lastIndexOf(".")); // 확장자 구하기 = 고유한 이름 구하기 위해서 
				
				String uName = UUID.randomUUID().toString()+ext;
				String fullPath = path+"/"+vo.getCate1()+"/"+vo.getCate2()+"/";		  // UUID = universal Unique id 
			
				try {
					Path root = Paths.get(fullPath);
					Files.createDirectories(root);
					
					mf.transferTo(new File(fullPath+uName));
					
					if(i==0) vo.setThumb1(uName);
					if(i==1) vo.setThumb2(uName);
					if(i==2) vo.setThumb3(uName);
					if(i==3) vo.setDetail(uName);
										
				}catch (Exception e) {
					e.printStackTrace();
				}
				
			
			}
		
		
		}
		return vo;
	}
}
