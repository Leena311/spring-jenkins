package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {
	public static Logger log=LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);

	@Test
	void contextLoads() {
	log.info("Test case is executing");
	//log.info(" My 2 nd Test case is executing ...............");
	log.info(" My 2 nd Test case is executing  after comment line...............");
	
		assertEquals(true, true);
	}

}
