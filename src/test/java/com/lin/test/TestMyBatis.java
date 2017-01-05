package com.lin.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;  

import com.alibaba.fastjson.JSON;
import com.lin.entity.User;
import com.lin.service.IUserService;

//测试Mybatis和spring的整合
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring/spring-mybatis.xml"})  
public class TestMyBatis {
	 private static Logger logger = Logger.getLogger(TestMyBatis.class);  
	//  private ApplicationContext ac = null;  
	    @Resource  
	    private IUserService userService;  
	  
	    @Test  
	    public void test1() {  
	        User user = userService.getUserById(1);  
	        // System.out.println(user.getUserName());  
	        // logger.info("值："+user.getUserName());  
	        logger.info(JSON.toJSONString(user));  
	    }  

}
