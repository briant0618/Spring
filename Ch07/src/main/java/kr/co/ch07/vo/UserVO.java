package kr.co.ch07.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor // 모든 arg들 가지고 controller 만드는 annotation
@NoArgsConstructor // 4개는 VO만들떄 기본적으로 써야합니다.
public class UserVO {

	private String uid;
	private String name;
	private String hp;
	private int age;
	
	
}
