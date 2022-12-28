package com.personal.qaforumjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication()
public class QaForumJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(QaForumJavaApplication.class, args);
	}

}
