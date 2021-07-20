package kr.co.ch08.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.ch08.vo.UserVO;

@Repository
public interface UserDAO {

	public void insertUser(UserVO vo);
	
	public List<UserVO> selectUsers();
	
	public UserVO selectUser(String uid);
	
	public void updateUser(UserVO vo);
	
	public void deleteUser(String uid);
}