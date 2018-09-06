package org.white.mutidatasource2.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * <p></p >
 *
 * @author baixiong
 * @version $Id: DataSourceConfig.java, v 0.1 2018年09月06日 14:21:00 baixiong Exp$
 */
@Configuration
public class DataSourceConfig {

    @Autowired
    private Environment env;

    @Bean
    public DataSource backDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(env.getProperty("spring.datasource.back.jdbcUrl"));
        dataSource.setUsername(env.getProperty("spring.datasource.back.username"));
        dataSource.setPassword(env.getProperty("spring.datasource.back.password"));
        return dataSource;
    }

    @Bean
    public DataSource frontDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(env.getProperty("spring.datasource.front.jdbcUrl"));
        dataSource.setUsername(env.getProperty("spring.datasource.front.username"));
        dataSource.setPassword(env.getProperty("spring.datasource.front.password"));
        return dataSource;
    }

    @Bean
    @Primary
    public DataSource dynamicDataSource() {
        MyDynamicDataSource dataSource = new MyDynamicDataSource();
        dataSource.setDefaultTargetDataSource(frontDataSource());

        Map<Object, Object> allDataSource = new HashMap<>();
        allDataSource.put("backDataSource", backDataSource());
        allDataSource.put("frontDataSource", frontDataSource());
        dataSource.setTargetDataSources(allDataSource);
        return dataSource;
    }

}
