package com.san.mybatis.sqlsession.proxy;

import com.san.mybatis.cfg.Mapper;
import com.san.mybatis.utils.Executor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.util.Map;

/**
 * Created by 三七 on 2020/12/1.
 */
public class MapperProxy implements InvocationHandler {

    //Map的key是全限定类名+方法名
    private Map<String, Mapper> mappers;
    private Connection conn;
    public MapperProxy(Map<String,Mapper> mappers,Connection conn){
        this.mappers = mappers;
        this.conn = conn;
    }
    /**
     * 用于增强
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //获取方法名
        String methodName = method.getName();
        //获取方法所在类的名称
        String className = method.getDeclaringClass().getName();
        //组合key
        String key = className+"."+methodName;
        //获取Mapper中的Mapper对象
        Mapper mapper = mappers.get(key);
        //判断是否有mapper
        if (mapper == null){
            throw  new IllegalAccessException("传入参数有误");
        }
        //调用工具类查询所有
        return new Executor().selectList(mapper,conn);
    }
}
