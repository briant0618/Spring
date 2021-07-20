package kr.co.ch05.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ch05.vo.UserVO;

@Repository // DAO는 repository에 속함

public class UserDAO {
	//Spring에서는 single Tone 객체 생성x
	
	
	// 이제 MyBatis에 DB Query 위임했으니 MyBatis member를 지정해야한다.
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertUser(UserVO vo) {
		
		mybatis.insert("mapper.user.INSERT_USER", vo); // JSP SQL 1~6단계 구문과 같은 기능
		
	}
	
	public UserVO selectUser(String uid) {
		return mybatis.selectOne("mapper.user.SELECT_USER", uid);
	}
	
	
	public List<UserVO> selectUsers() { // 사용자 목록 불러오기
	
		return mybatis.selectList("mapper.user.SELECT_USERS"); // VO객체들을 가지는 array 생성
		// List<UserVO> users = mybatis.selectList("mapper.user.SELECT_USERS"); return users; 두개를 합성 // VO객체들을 가지는 array 생성
	}			
	
	public void updateUser(UserVO vo) {
		mybatis.update("mapper.user.UPDATE_USER", vo); // 4개의 객체를 다쓰기 귀찮아서 다 함유하는 vo를 씀
	}
	
	public void deleteUser(String uid) {
		
		mybatis.delete("mapper.user.DELETE_USER", uid);
		
	}
	
}
