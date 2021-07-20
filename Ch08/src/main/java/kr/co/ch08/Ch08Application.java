package kr.co.ch08;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("kr.co.ch08.dao") // springboot에서 dao에 있는 모든 구문 [ 선언해야 mybatis 사용 가능]

@SpringBootApplication
public class Ch08Application {

	public static void main(String[] args) {
		SpringApplication.run(Ch08Application.class, args);
	}

}
