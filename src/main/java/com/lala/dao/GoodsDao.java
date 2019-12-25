package com.lala.dao;

import com.lala.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface GoodsDao {
    List<Goods> selectOne(Integer id);
}
