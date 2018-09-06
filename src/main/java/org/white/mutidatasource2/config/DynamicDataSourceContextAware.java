package org.white.mutidatasource2.config;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * <p></p >
 *
 * @author baixiong
 * @version $Id: DynamicDataSourceContextHolder.java, v 0.1 2018年09月06日 14:54:00 baixiong Exp$
 */
@Component
public class DynamicDataSourceContextAware implements ApplicationContextAware {

    public static Set<String> names = new HashSet<>();

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, DataSource> dataSources = applicationContext.getBeansOfType(DataSource.class);
        for (String dataSourceName : dataSources.keySet()) {
            if (!"dynamicDataSource".equals(dataSourceName)) {
                names.add(dataSourceName);
            }
        }
    }
}
