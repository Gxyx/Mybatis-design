package com.san.mybatis.cfg;

/**
 * Created by 三七 on 2020/12/1.
 * 用于封装结果和全限定类名
 */
public class Mapper {

    //SQL
    private String queryString;
    //实体类的全限定类名
    private String resultType;

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }
}
