package kr.co.kmarket.vo;

import java.util.List;

import lombok.Data;

@Data
public class CategoriesVO {
	private int code1;
	private String title;
	private List<Cate2VO> cate2List; // main index category를 2중 for문 출력하기위해 list로 만든다.
}
