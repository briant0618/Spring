package kr.co.ch05.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ch05.vo.UserVO;

@Repository // DAO�� repository�� ����

public class UserDAO {
	//Spring������ single Tone ��ü ����x
	
	
	// ���� MyBatis�� DB Query ���������� MyBatis member�� �����ؾ��Ѵ�.
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertUser(UserVO vo) {
		
		mybatis.insert("mapper.user.INSERT_USER", vo); // JSP SQL 1~6�ܰ� ������ ���� ���
		
	}
	
	public UserVO selectUser(String uid) {
		return mybatis.selectOne("mapper.user.SELECT_USER", uid);
	}
	
	
	public List<UserVO> selectUsers() { // ����� ��� �ҷ�����
	
		return mybatis.selectList("mapper.user.SELECT_USERS"); // VO��ü���� ������ array ����
		// List<UserVO> users = mybatis.selectList("mapper.user.SELECT_USERS"); return users; �ΰ��� �ռ� // VO��ü���� ������ array ����
	}			
	
	public void updateUser(UserVO vo) {
		mybatis.update("mapper.user.UPDATE_USER", vo); // 4���� ��ü�� �پ��� �����Ƽ� �� �����ϴ� vo�� ��
	}
	
	public void deleteUser(String uid) {
		
		mybatis.delete("mapper.user.DELETE_USER", uid);
		
	}
	
}
