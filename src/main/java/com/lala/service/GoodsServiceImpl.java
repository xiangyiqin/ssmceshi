package com.lala.service;

import com.lala.dao.GoodsDao;
import com.lala.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsServiceImpl implements GoodsService{
    @Autowired
    private GoodsDao goodsDao;

    @Override
    public List<Goods> selectOne(int i) {
        List<Goods> goods = goodsDao.selectOne(i);
        System.out.println(goods+"service");
        System.out.println("zhixingle");
        return goods;
    }
}
