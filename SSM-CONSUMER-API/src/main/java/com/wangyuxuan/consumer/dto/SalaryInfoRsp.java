package com.wangyuxuan.consumer.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: wangyuxuan
 * @Date: 2018/12/20 16:36
 * @Description:
 */

@Data
public class SalaryInfoRsp implements Serializable {

    private int userId ;
    private String username ;
    private double price ;
}
