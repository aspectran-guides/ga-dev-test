/**
 *    Copyright 2009-2015 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.aspectran.support.orm.mybatis;

import org.apache.ibatis.session.SqlSession;

import com.aspectran.core.activity.Translet;

public abstract class MyBatisDaoSupport {

	private String relevantAspectId;

	public void setRelevantAspectId(String relevantAspectId) {
		this.relevantAspectId = relevantAspectId;
	}
	
	public SqlSession getSqlSession(Translet translet) {
		SqlSessionTransactionAdvice advice = translet.getAspectAdviceBean(relevantAspectId);
		if (advice == null) {
			throw new IllegalArgumentException("SqlSessionTransactionAdvice is not specified.");
		}

		SqlSession sqlSession = advice.getSqlSession();
		if (sqlSession == null) {
			throw new IllegalArgumentException("SqlSession is not opened.");
		}

		return sqlSession;
	}

}
