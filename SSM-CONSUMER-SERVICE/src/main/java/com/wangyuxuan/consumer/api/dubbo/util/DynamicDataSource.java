package com.wangyuxuan.consumer.api.dubbo.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @Auther: wangyuxuan
 * @Date: 2018/12/17 14:47
 * @Description:
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceHolder.getDataSources();
    }
}
