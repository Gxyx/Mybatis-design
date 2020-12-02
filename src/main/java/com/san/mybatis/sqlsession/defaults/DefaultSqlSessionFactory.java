package com.san.mybatis.sqlsession.defaults;

import com.san.mybatis.cfg.Configuration;
import com.san.mybatis.sqlsession.SqlSession;
import com.san.mybatis.sqlsession.SqlSessionFactory;

/**
 * Created by 三七 on 2020/12/1.
 * SqlSessionFactory接口的实现类
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {
    private Configuration cfg;

    public DefaultSqlSessionFactory(Configuration cfg){
        this.cfg = cfg;
    }
    /**
     * 用于创建新的连接
     * @return
     */
    public SqlSession openSession() {
        return new DefaultSqlSession(cfg);
    }
}
