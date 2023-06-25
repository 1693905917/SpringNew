package com.itheima.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.sun.tracing.ProbeName;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.util.ResourceBundle;

/**
 * @BelongsProject: SpringNew
 * @BelongsPackage: com.itheima.config
 * @Author: ASUS
 * @CreateTime: 2023-06-23  17:07
 * @Description: TODO
 * @Version: 1.0
 */
//标志该类是spring的核心配置类
@Configuration
// @ComponentScan("com.itheima")相当于<context:component-scan base-package="com.itheima"></context:component-scan>
@ComponentScan("com.itheima")
@Import(DataSourceConfiguration.class)
public class SpringConfiguration {

}
