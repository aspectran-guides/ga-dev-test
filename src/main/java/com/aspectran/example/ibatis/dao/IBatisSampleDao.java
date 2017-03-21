package com.aspectran.example.ibatis.dao;

import java.sql.SQLException;

import com.aspectran.core.activity.Translet;
import com.aspectran.support.orm.ibatis.IBatisDaoSupport;
import com.ibatis.sqlmap.client.SqlMapClient;

public class IBatisSampleDao extends IBatisDaoSupport {

    public Object selectOne(Translet translet) throws SQLException {
        SqlMapClient sqlMapClient = getSqlMapClient(translet);
        return sqlMapClient.queryForObject("sample.selectOne", translet.getParameterMap());
    }

    public void insertOne(Translet translet) throws SQLException {
        SqlMapClient sqlMapClient = getSqlMapClient(translet);
        sqlMapClient.insert("sample.insertOne", translet.getParameterMap());
    }

    public void updateOne(Translet translet) throws SQLException {
        SqlMapClient sqlMapClient = getSqlMapClient(translet);
        sqlMapClient.update("sample.updateOne", translet.getParameterMap());
    }

    public void deleteOne(Translet translet) throws SQLException {
        SqlMapClient sqlMapClient = getSqlMapClient(translet);
        sqlMapClient.delete("sample.deleteOne", translet.getParameterMap());
    }

}
