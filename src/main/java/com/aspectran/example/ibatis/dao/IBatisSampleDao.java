package com.aspectran.example.ibatis.dao;

import java.sql.SQLException;

import com.aspectran.core.activity.Translet;
import com.aspectran.support.orm.ibatis.IBatisDaoSupport;
import com.ibatis.sqlmap.client.SqlMapClient;

public class IBatisSampleDao extends IBatisDaoSupport {

    public Object selectOne(Translet translet) throws SQLException {
        SqlMapClient sqlMapClient = getSqlMapClient(translet);
        return sqlMapClient.queryForObject("sample.selectOne", translet.getAllParameters());
    }

    public void insertOne(Translet translet) throws SQLException {
        SqlMapClient sqlMapClient = getSqlMapClient(translet);
        sqlMapClient.insert("sample.insertOne", translet.getAllParameters());
    }

    public void updateOne(Translet translet) throws SQLException {
        SqlMapClient sqlMapClient = getSqlMapClient(translet);
        sqlMapClient.update("sample.updateOne", translet.getAllParameters());
    }

    public void deleteOne(Translet translet) throws SQLException {
        SqlMapClient sqlMapClient = getSqlMapClient(translet);
        sqlMapClient.delete("sample.deleteOne", translet.getAllParameters());
    }

}
