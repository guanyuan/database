package com;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtils {

    public SqlSession createFactory() throws IOException {
        //Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        InputStream reader = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(reader);
        return sqlSessionFactory.openSession();
    }

}
