package com.mybatis;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserServiceTest {
    
    @Test
    public void userServiceTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserService userService = (UserService)context.getBean("userService");
//        System.out.println(userService.countAll());
    }

}