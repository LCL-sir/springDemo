package com.service.Impl;


import com.mapper.TestUserMapper;
import com.entity.users;
import com.service.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestUserServiceImpl implements TestUserService {


    @Autowired
    private TestUserMapper testUserMapper;
    @Override
    public List<users> usersList() {
        List<users> users = testUserMapper.usersList();
        if (users == null){
            return null;
        }
        return users;
    }
}
