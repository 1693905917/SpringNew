package com.itheima.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @BelongsProject: SpringNew
 * @BelongsPackage: com.itheima.config
 * @Author: ASUS
 * @CreateTime: 2023-06-23  17:17
 * @Description: TODO
 * @Version: 1.0
 */
// @PropertySource("classpath:jdbc.properties")相当于 <context:property-placeholder location="classpath:jdbc.properties"></context:property-placeholder>
@PropertySource("classpath:jdbc.properties")
public class DataSourceConfiguration {
    // <bean id="dataSource"  class="com.mchange.v2.c3p0.ComboPooledDataSource">
    //        <property name="driverClass" value="${jdbc.driver}"></property>
    //        <property name="jdbcUrl" value="${jdbc.url}"></property>
    //        <property name="user" value="${jdbc.username}"></property>
    //        <property name="password" value="${jdbc.password}"></property>
    //    </bean>
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean("dataSource")
    public DataSource getDataSource() throws Exception {
        //创建数据源对象
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(driver);
        dataSource.setJdbcUrl(url);
        dataSource.setUser(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}
