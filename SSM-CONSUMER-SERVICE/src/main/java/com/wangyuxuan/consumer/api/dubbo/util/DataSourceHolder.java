package com.wangyuxuan.consumer.api.dubbo.util;

/**
 * @Auther: wangyuxuan
 * @Date: 2018/12/17 14:48
 * @Description:
 */
public class DataSourceHolder {

    private static final ThreadLocal<String> dataSources = new ThreadLocal<>();

    public static void setDataSources(String dataSource){
        dataSources.set(dataSource);
    }

    public static String getDataSources() {
        return dataSources.get();
    }
}
