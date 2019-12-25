package com.lala.test;

import com.lala.service.GoodsService;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void test1(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:application.xml");
        GoodsService as = (GoodsService) ac.getBean("goodsServiceImpl");
        as.selectOne(1);
    }

}
