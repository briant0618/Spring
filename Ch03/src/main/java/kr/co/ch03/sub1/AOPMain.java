package kr.co.ch03.sub1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * ��¥ : 2021/07/13
 * �̸� : �赿��
 * ���� : ������ AOP �ǽ��ϱ�
 * 
 * ������ AOP(Aspect Oriented Programming)
 * 
 * ��������Ʈ(JoinPoint)
 * 
 * ����Ʈ��(PointCut)
 * 
 * �����̽�(Advice)
 * 
 * ������Ʈ(Aspect)
 * 
 * ����(Weaving)
 */
public class AOPMain {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		
		ArticleDao dao = (ArticleDao) ctx.getBean("articleDao");
		dao.insertArticle();
		
	}
}