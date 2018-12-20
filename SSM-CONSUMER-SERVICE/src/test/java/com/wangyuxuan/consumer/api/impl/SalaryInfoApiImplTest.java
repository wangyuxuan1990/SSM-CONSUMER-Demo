package com.wangyuxuan.consumer.api.impl;

import com.alibaba.fastjson.JSON;
import com.wangyuxuan.consumer.api.SalaryInfoApi;
import com.wangyuxuan.consumer.dto.SalaryInfoRsp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Auther: wangyuxuan
 * @Date: 2018/12/20 17:31
 * @Description:
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/spring/*.xml" })
public class SalaryInfoApiImplTest {

    @Resource
    private SalaryInfoApi salaryInfoApi;

    @Test
    public void getSalaryInfo() throws Exception{
        SalaryInfoRsp salaryInfoRsp = salaryInfoApi.getSalaryInfo(1);
        System.out.println(JSON.toJSONString(salaryInfoRsp));
    }
}
