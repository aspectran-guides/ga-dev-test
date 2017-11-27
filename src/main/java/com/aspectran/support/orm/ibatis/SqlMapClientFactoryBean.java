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

import com.aspectran.core.component.bean.ablility.FactoryBean;
import com.aspectran.core.component.bean.ablility.InitializableBean;
import com.aspectran.core.component.bean.aware.EnvironmentAware;
import com.aspectran.core.context.env.Environment;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
* The Class SqlMapClientFactoryBean.
*
* @author Juho Jeong
*
* <p>Created: 2015. 04. 03</p>
*/
public class SqlMapClientFactoryBean implements EnvironmentAware, InitializableBean, FactoryBean<SqlMapClient> {

    private Environment environment;

    private String configLocation;

    private Properties sqlMapClientProperties;

    private SqlMapClient sqlMapClient;

    /**
     * Set the location of the iBATIS SqlMapClient config file.
     * A typical value is "/WEB-INF/sql-map-config.xml".
     */
    public void setConfigLocation(String configLocation) {
        this.configLocation = configLocation;
    }

    /**
     * Set optional properties to be passed into the SqlMapClientBuilder, as
     * alternative to a <code>&lt;properties&gt;</code> tag in the sql-map-config.xml
     * file. Will be used to resolve placeholders in the config file.
     * @see #setConfigLocation
     * @see com.ibatis.sqlmap.client.SqlMapClientBuilder#buildSqlMapClient(java.io.Reader, java.util.Properties)
     */
    public void setSqlMapClientProperties(Properties sqlMapClientProperties) {
        this.sqlMapClientProperties = sqlMapClientProperties;
    }

    private void buildSqlMapClient(InputStream is) {
        this.sqlMapClient = SqlMapClientBuilder.buildSqlMapClient(new InputStreamReader(is), sqlMapClientProperties);
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    @Override
    public void initialize() throws Exception {
        if (this.sqlMapClient == null) {
            if (configLocation == null) {
                throw new IllegalArgumentException("Property 'configLocation' is required");
            }

            File file = environment.toRealPathAsFile(configLocation);
            InputStream is = new FileInputStream(file);

            buildSqlMapClient(is);
        }
    }

    @Override
    public SqlMapClient getObject() {
        return this.sqlMapClient;
    }

}