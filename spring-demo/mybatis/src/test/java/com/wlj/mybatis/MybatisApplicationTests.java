package com.wlj.mybatis;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisApplicationTests {

	@Test
	void contextLoads() {
	}

	@BeforeAll
	public void before(){
		System.out.println("开始测试-----------------");
	}

	@AfterAll
	public void after(){
		System.out.println("测试结束-----------------");
	}

}
