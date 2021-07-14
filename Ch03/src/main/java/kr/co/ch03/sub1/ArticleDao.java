package kr.co.ch03.sub1;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component
public class ArticleDao {
	
	@Inject
	private DaoAdvice advice;
	
	public void insertArticle() {
		advice.beforeAdvice1();
		System.out.println("헥심관심 - insertArticle");
		advice.afterAdvice1();
	}
	
	public void selectArticle() {
		System.out.println("헥심관심 - selectArticle");
	}
	
	public void selectArticles() {
		System.out.println("헥심관심 - selectArticles");
	}
	
	public void updateArticle() {
		System.out.println("헥심관심 - updateArticle");
	}
	
	public void deleteArticle() {
		System.out.println("헥심관심 - deleteArticle");
	}
}