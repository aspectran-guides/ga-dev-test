/**
 * Copyright 2008-2016 Juho Jeong
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aspectran.support.orm.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * SqlSession Transaction Advice
 *
 * <blockquote cite="https://mybatis.github.io/mybatis-3/java-api.html">
 * By default MyBatis does not actually commit unless it detects
 * that the database has been changed by a call to insert, update or delete.
 * If you've somehow made changes without calling these methods,
 * then you can pass true into the commit and rollback methods to guarantee
 * that it will be committed (note, you still can't force a session in auto-commit mode,
 * or one that is using an external transaction manager).
 * </blockquote>
 *
 * @author Juho Jeong
 * @since 2015. 04. 03.
*/
public class SqlSessionTransactionAdvice {

    private final SqlSessionFactory sqlSessionFactory;

    private boolean autoCommit;

    private boolean forceCommit;

    private boolean forceRollback;

    private SqlSession sqlSession;

    public SqlSessionTransactionAdvice(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public void setAutoCommit(boolean autoCommit) {
        this.autoCommit = autoCommit;
    }

    public void setForceCommit(boolean forceCommit) {
        this.forceCommit = forceCommit;
    }

    public void setForceRollback(boolean forceRollback) {
        this.forceRollback = forceRollback;
    }

    public SqlSession getSqlSession() {
        return sqlSession;
    }

    public SqlSession open() {
        if(sqlSession == null) {
            sqlSession = sqlSessionFactory.openSession(autoCommit);
        }
        return sqlSession;
    }

    public SqlSession open(boolean autoCommit) {
        this.autoCommit = autoCommit;
        return open();
    }

    public void commit() {
        if(sqlSession != null) {
            sqlSession.commit(forceCommit);
        }
    }

    public void commit(boolean force) {
        if(sqlSession != null) {
            sqlSession.commit(force);
        }
    }

    /**
     * Rollback.
     *
     * <blockquote cite="https://mybatis.github.io/mybatis-3/java-api.html">
     * Most of the time you won't have to call rollback(),
     * as MyBatis will do that for you if you don't call commit.
     * However, if you need more fine grained control over a session where multiple commits
     * and rollbacks are possible, you have the rollback option there to make that possible.
     * </blockquote>
     */
    public void rollback() {
        if(sqlSession != null) {
            sqlSession.rollback(forceRollback);
        }
    }

    public void rollback(boolean force) {
        if(sqlSession != null) {
            sqlSession.rollback(force);
        }
    }

    public void close() {
        if(sqlSession != null) {
            sqlSession.close();
            sqlSession = null;
        }
    }

}
