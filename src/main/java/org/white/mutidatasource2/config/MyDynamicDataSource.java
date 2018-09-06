package org.white.mutidatasource2.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * <p></p >
 *
 * @author baixiong
 * @version $Id: MyDynamicDataSource.java, v 0.1 2018年09月06日 15:09:00 baixiong Exp$
 */
public class MyDynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DynamicDataSourceContextHolder.get();
    }
}
