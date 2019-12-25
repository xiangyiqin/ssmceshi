package com.lala.test;

import com.lala.pojo.Goods;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

public class testMybatis {
    @Test
    public void test1() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory= new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession session = factory.openSession();
        String statement="com.lala.dao.GoodsDao.selectOne";
        Goods o = session.selectOne(statement, 1);
        System.out.println(o);

    }
}
