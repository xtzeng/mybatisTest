package com.icreate.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(value = SpringJUnit4ClassRunner.class)   
@ContextConfiguration(value = "applicationContext.xml")
public class AnotationTest {
	
	@Autowired
	private UserService userService;

	
	@Test
	public void countAll(){
		System.out.println("数据库中的记录条数:" + userService.countAll());
	}
}
