package com.personal.qaforumjava;

import static org.assertj.core.api.Assertions.assertThat;

import com.personal.qaforumjava.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class QaForumJavaApplicationTests {

	@Test
	void contextLoads(ApplicationContext context) {
		assertThat(context).isNotNull();
	}
}
