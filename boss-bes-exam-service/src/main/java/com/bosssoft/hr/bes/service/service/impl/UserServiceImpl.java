package com.bosssoft.hr.bes.service.service.impl;

import com.bosssoft.hr.bes.dao.Mapper.UserMapper;
import com.bosssoft.hr.bes.exam.pojo.pojo.User;
import com.bosssoft.hr.bes.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yzq
 * @date 2019/11/25 0025
 * @time 下午 09:49
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;


    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }
}
