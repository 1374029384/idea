package com.blb.service;

import com.blb.mapper.UserMapper;
import com.blb.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryById(Long i) {
        User user = userMapper.selectByPrimaryKey(i);
        return  user;
    }

    @Transactional
    public void delById(Long id) {
        userMapper.deleteByPrimaryKey(id);
    }

    public List<User> queryAllUser() {

        return userMapper.selectAll();
    }
}
