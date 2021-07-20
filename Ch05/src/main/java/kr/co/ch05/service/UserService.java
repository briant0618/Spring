package kr.co.ch05.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ch05.dao.UserDAO;
import kr.co.ch05.vo.UserVO;

@Service // Component로 정의해도 되지만 구분위해서 Service Component 지정
public class UserService {
	
	
	@Autowired
	private UserDAO dao;
	
	
	public void insertUser(UserVO vo) {
		dao.insertUser(vo);
		
	}
	
	public UserVO selectUser(String uid) {
		return dao.selectUser(uid);
	}
	
	public List<UserVO> selectUsers() {
			// 합성 시작 List<UserVO> users = dao.selectUsers(); return users;
		return dao.selectUsers();
	}
	
	public void updateUser(UserVO vo) {
		dao.updateUser(vo);
	}
	
	public void deleteUser(String uid) {
		dao.deleteUser(uid);
	}
}
