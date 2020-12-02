package com.san.dao;

import com.san.domain.User;
import com.san.mybatis.annotations.Select;

import java.util.List;

/**
 * Created by 三七 on 2020/12/1.
 */
public interface UserDao {
    /**
     * 查询所有用户
     * @return
     */
    @Select("Select * from user")
    List<User> findAll();
}
