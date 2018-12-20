package com.wangyuxuan.consumer.api.dubbo.dao;

import com.wangyuxuan.consumer.api.dubbo.pojo.T_user;

import java.util.Set;

public interface T_userMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(T_user record);

    int insertSelective(T_user record);

    T_user selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(T_user record);

    int updateByPrimaryKey(T_user record);

    /**
     *
     * 功能描述: 根据username查询用户
     *
     * @param: [username]
     * @return: com.wangyuxuan.pojo.T_user
     * @auther: wangyuxuan
     * @date: 2018/12/3 14:49
     */
    T_user findUserByUsername(String username);

    /**
     *
     * 功能描述: 根据username查询该用户的所有角色
     *
     * @param: [username]
     * @return: java.util.Set<java.lang.String>
     * @auther: wangyuxuan
     * @date: 2018/12/3 14:49
     */
    Set<String> findRoles(String username);

    /**
     *
     * 功能描述: 根据username查询他所拥有的权限信息
     *
     * @param: [username]
     * @return: java.util.Set<java.lang.String>
     * @auther: wangyuxuan
     * @date: 2018/12/3 14:50
     */
    Set<String> findPermissions(String username);
}