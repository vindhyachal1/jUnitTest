package com.example.junit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class JunitExampleApplicationTests {
	private Calculator c = new Calculator();

	@Test
	void contextLoads() {
	}
	@Test
	void testSum(){
		int expectedResult = 17;
		int actualResult = c.doSum(12, 3, 2);
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	@Test
	void testProduct(){
		int expectedResult=6;
		int actualyResult=c.doProduct(2,3);
		assertThat(actualyResult).isEqualTo(expectedResult);
	}

	@Test
	void testCompareNums(){
		Boolean actualResult=c.compareTwoNums(3, 3);
		assertThat(actualResult).isTrue();
	}
}
