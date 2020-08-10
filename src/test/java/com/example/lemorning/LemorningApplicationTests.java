package com.example.lemorning;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


@SpringBootTest
@ActiveProfiles("local")
class LemorningApplicationTests {

	@Test
	void contextLoads() {
	}

	@Value("${property.test.name}")
	private String propertyTestName;

	@Value("${propertyTest}")
	private String propertyTest;

	@Value("${noKey:default value}")
	private String defaultValue;

	@Value("${propertyTestList}")
	private String[] propertyTestArray;

	@Value("#{'${propertyTestList}'.split(',')}")
	private List<String> propertyTestList;

	@Value("${server.port}")
	private int port;

	@Test
	public void testVal(){
		assertThat(propertyTestName,is("property depth test"));
		assertThat(propertyTest,is("test"));
		assertThat(defaultValue,is("default value"));

		assertThat(propertyTestArray[0],is("a"));
		assertThat(propertyTestList.get(0),is("a"));
	}

	@Test
	public void testPort(){
		assertThat(port,is(8080));
	}
}
