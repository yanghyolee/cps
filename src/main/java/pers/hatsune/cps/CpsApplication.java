package pers.hatsune.cps;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("pers.hatsune.cps.dao")
public class CpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CpsApplication.class, args);
	}
}
