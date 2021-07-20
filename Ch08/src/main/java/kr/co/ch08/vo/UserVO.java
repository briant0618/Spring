package kr.co.ch08.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data // Getter Setter와 다른 annotation몇개를 통합한 annotation
@AllArgsConstructor
@NoArgsConstructor

public class UserVO {
	private String uid;
	private String name;
	private String hp;
	private int age;
}
