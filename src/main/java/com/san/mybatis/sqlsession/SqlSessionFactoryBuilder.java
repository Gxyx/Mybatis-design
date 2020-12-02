package com.san.mybatis.sqlsession;

import com.san.mybatis.cfg.Configuration;
import com.san.mybatis.sqlsession.defaults.DefaultSqlSessionFactory;
import com.san.mybatis.utils.XMLConfigBuilder;

import java.io.InputStream;

/**
 * Created by 三七 on 2020/12/1.
 * 用于创建一个SqlSessionFactory对象
 */
public class SqlSessionFactoryBuilder {

    /**
     * 根据参数的字节输入流来构建一个SqlSessionFactory工厂
     * @param config
     * @return
     */
    public SqlSessionFactory build(InputStream config){
        Configuration cfg = XMLConfigBuilder.loadConfiguration(config);
        return new DefaultSqlSessionFactory(cfg);
    }
}
