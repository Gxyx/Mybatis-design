package com.san.mybatis.sqlsession;

import java.io.InputStream;

/**
 * Created by 三七 on 2020/12/1.
 *
 */
public interface SqlSessionFactory {

    /**
     * 用于打开一个新的Session对象
     * @return
     */
    SqlSession openSession();

}
