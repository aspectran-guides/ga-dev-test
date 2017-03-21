package com.aspectran.example.mybatis.dao;

import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;

import com.aspectran.core.activity.Translet;
import com.aspectran.support.orm.mybatis.MyBatisDaoSupport;

public class MyBatisSampleDao extends MyBatisDaoSupport {

    public Object selectOne(Translet translet) throws SQLException {
        SqlSession sqlSession = getSqlSession(translet);
        return sqlSession.selectOne("sample.selectOne", translet.getParameterMap());
    }

    public void insertOne(Translet translet) throws SQLException {
        SqlSession sqlSession = getSqlSession(translet);
        sqlSession.insert("sample.insertOne", translet.getParameterMap());
    }

    public void updateOne(Translet translet) throws SQLException {
        SqlSession sqlSession = getSqlSession(translet);
        sqlSession.update("sample.updateOne", translet.getParameterMap());
    }

    public void deleteOne(Translet translet) throws SQLException {
        SqlSession sqlSession = getSqlSession(translet);
        sqlSession.delete("sample.deleteOne", translet.getParameterMap());
    }

}
