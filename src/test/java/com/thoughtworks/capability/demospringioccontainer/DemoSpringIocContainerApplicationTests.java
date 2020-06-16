package com.thoughtworks.capability.demospringioccontainer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoSpringIocContainerApplicationTests {

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	void contextLoads() {
		GreetingController greetingController1 = applicationContext.getBean(GreetingController.class);
		GreetingController greetingController2 = applicationContext.getBean(GreetingController.class);
		assertEquals(greetingController1.getGreetingService(), greetingController2.getGreetingService());
	}

}
