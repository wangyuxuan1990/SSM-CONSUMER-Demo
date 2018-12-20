package com.wangyuxuan.consumer.api.dubbo.util;

import org.aspectj.lang.JoinPoint;

/**
 * @Auther: wangyuxuan
 * @Date: 2018/12/17 16:13
 * @Description:
 */
public class DataSourceExchange {

    public void before(JoinPoint point){

        //获取目标对象的类类型
        Class<?> aClass = point.getTarget().getClass();

        //获取包名用于区分不同数据源
        String whichDataSource = aClass.getName().substring(33, aClass.getName().lastIndexOf("."));
        if("ssmone".equals(whichDataSource)){
            DataSourceHolder.setDataSources(Constants.DATASOURCE_ONE);
        }else {
            DataSourceHolder.setDataSources(Constants.DATASOURCE_TWO);
        }
    }

    /**
     * 执行后将数据源置为空
     */
    public void after(){
        DataSourceHolder.setDataSources(null);
    }
}
