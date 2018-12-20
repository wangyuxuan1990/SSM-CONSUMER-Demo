package com.wangyuxuan.consumer.api;

import com.wangyuxuan.consumer.dto.SalaryInfoRsp;

/**
 * @Auther: wangyuxuan
 * @Date: 2018/12/20 16:38
 * @Description:
 */
public interface SalaryInfoApi {

    /**
     *
     * 功能描述: 获取薪资
     *
     * @param: [userId]
     * @return: com.wangyuxuan.consumer.dto.SalaryInfoRsp
     * @auther: wangyuxuan
     * @date: 2018/12/20 16:39
     */
    SalaryInfoRsp getSalaryInfo(int userId) throws Exception;
}
