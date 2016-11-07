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
package com.aspectran.support.orm.ibatis;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

/**
* The Class SqlMapClientTransactionAdvice.
*
* <p>Created: 2015. 04. 03</p>

* @author Juho Jeong
*/
public class SqlMapClientTransactionAdvice {
	
	private final SqlMapClient sqlMapClient;

	private boolean started;

	public SqlMapClientTransactionAdvice(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}
	
	public SqlMapClient getSqlMapClient() {
		return sqlMapClient;
	}

	public boolean isStarted() {
		return started;
	}

	public SqlMapClient start() throws SQLException {
		if(!started) {
			sqlMapClient.startTransaction();
			started = true;
		}
		return sqlMapClient;
	}
	
	public void commit() throws SQLException {
		if(started) {
			sqlMapClient.commitTransaction();
		}
	}
	
	public void end() throws SQLException {
		if(started) {
			sqlMapClient.endTransaction();
			started = false;
		}
	}
	
}
