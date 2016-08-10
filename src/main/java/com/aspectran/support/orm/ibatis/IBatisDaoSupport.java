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

import com.aspectran.core.activity.Translet;
import com.ibatis.sqlmap.client.SqlMapClient;

public abstract class IBatisDaoSupport {

	private String revelentAspectId;

	public void setRevelentAspectId(String revelentAspectId) {
		this.revelentAspectId = revelentAspectId;
	}
	
	public SqlMapClient getSqlMapClient(Translet translet) {
		SqlMapClient sqlMapClient = translet.getBeforeAdviceResult(revelentAspectId);
		return sqlMapClient;
	}

}