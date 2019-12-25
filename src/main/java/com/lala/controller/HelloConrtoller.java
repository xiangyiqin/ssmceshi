package com.lala.controller;

import com.lala.dao.GoodsDao;
import com.lala.pojo.Goods;
import com.lala.service.GoodsService;
import com.lala.service.GoodsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloConrtoller {
    @Autowired
    private GoodsService goodsService;
    @RequestMapping("/hello")
    public String hello(){
        List<Goods> goods = goodsService.selectOne(1);
        System.out.println(goods+"conrtoller");
        System.out.println("hello");
        return "success";
    }
}
