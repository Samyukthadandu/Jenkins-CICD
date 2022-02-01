package com.simplilearn.JenkinsCICD;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class JenkinsCicdApplicationTests {
	
	public static Logger logger = LoggerFactory.getLogger(JenkinsCicdApplicationTests.class);

	@Test
	void contextLoads() {
		
		logger.info("Test case executing...");
		assertEquals(true, true);
	}

}
