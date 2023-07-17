package tech.cqxqg.frame.user;

import tech.cqxqg.frame.core.enums.Constants;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("tech.cqxqg.frame.persistence.mapper")
@ComponentScan(Constants.BASE_PACKAGE)
public class UserServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(UserServerApplication.class, args);
		
	}
}
