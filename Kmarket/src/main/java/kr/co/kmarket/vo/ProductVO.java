package kr.co.kmarket.vo;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class ProductVO {
	
	private int code;
	private	int cate1;
	private	int cate2;
	private	String name;
	private	String descript;
	private	String company;
	private	String seller;
	private	int price;
	private	int discount;
	private	int point;
	private	int stock;
	private	int sold;
	private	int delivery;
	private	int hit;
	private	int score;
	private	int review;
	private	String thumb1;
	private	String thumb2;
	private	String thumb3;
	private	String detail;
	private	String status;
	private	String dutyFree;
	private	String receipt;
	private	String bizClass;
	private	String origin;
	private	String ip;
	private	String rdate;
	private int etc1;
	private int etc2;
	private String etc3;
	private String etc4;
	private String etc5;
	
	//추가 필드 [file에 대한것]
	
	private MultipartFile file1; // file에 대한 객체는 multipartfile이다.
	private MultipartFile file2;
	private MultipartFile file3;
	private MultipartFile file4;
	
	// 추가 필드2 [ 할인율에 있는 salePrice 추가해줌]
	private int salePrice;

	//selectTitles에 대한 추가 필드
	private String tit1;
	private String tit2;

}
