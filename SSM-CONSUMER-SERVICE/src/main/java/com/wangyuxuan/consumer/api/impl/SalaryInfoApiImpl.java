package com.wangyuxuan.consumer.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wangyuxuan.api.UserInfoApi;
import com.wangyuxuan.consumer.api.SalaryInfoApi;
import com.wangyuxuan.consumer.dto.SalaryInfoRsp;
import com.wangyuxuan.dto.UserInfoRsp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Auther: wangyuxuan
 * @Date: 2018/12/20 17:19
 * @Description:
 */

@Service
@Slf4j
public class SalaryInfoApiImpl implements SalaryInfoApi {

    @Autowired
    private UserInfoApi userInfoApi;

    /**
     *
     * 功能描述: 获取用户信息
     *
     * @param: [userId]
     * @return: com.wangyuxuan.consumer.dto.SalaryInfoRsp
     * @auther: wangyuxuan
     * @date: 2018/12/20 17:24
     */
    @Override
    public SalaryInfoRsp getSalaryInfo(int userId) throws Exception {
        log.info("薪资查询Id={}", userId);
        //返回对象
        SalaryInfoRsp salaryInfoRsp = new SalaryInfoRsp();
        //调用远程服务
        UserInfoRsp userInfoRsp = userInfoApi.getUserInfo(userId);
        salaryInfoRsp.setUsername(userInfoRsp.getUsername());
        return salaryInfoRsp;
    }
}
