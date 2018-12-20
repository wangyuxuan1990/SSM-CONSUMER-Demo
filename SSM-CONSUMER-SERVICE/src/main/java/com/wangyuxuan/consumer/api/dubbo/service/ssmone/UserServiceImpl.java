package com.wangyuxuan.consumer.api.dubbo.service.ssmone;

import com.wangyuxuan.consumer.api.dubbo.dao.T_userMapper;
import com.wangyuxuan.consumer.api.dubbo.pojo.T_user;
import com.wangyuxuan.consumer.api.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @Auther: wangyuxuan
 * @Date: 2018/12/3 16:04
 * @Description:
 */
@Service("t_userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private T_userMapper tUserMapper;

    @Override
    public T_user findUserByUsername(String username) {
        return tUserMapper.findUserByUsername(username);
    }

    @Override
    public Set<String> findRoles(String username) {
        return tUserMapper.findRoles(username);
    }

    @Override
    public Set<String> findPermissions(String username) {
        return tUserMapper.findPermissions(username);
    }

    @Override
    public T_user selectByPrimaryKey(int userId) {
        return tUserMapper.selectByPrimaryKey(userId);
    }
}
