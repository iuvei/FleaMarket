package com.fleamarket.core.service.impl;

import com.fleamarket.core.IMapper;
import com.fleamarket.core.mapper.UserMapper;
import com.fleamarket.core.model.User;
import com.fleamarket.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends BaseService<User> implements UserService {
    private final UserMapper mapper;

    @Autowired
    public UserServiceImpl(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    protected IMapper<User> getMapper() {
        return mapper;
    }

    @Override
    public User selectByPrincipal(String principal) {
        return mapper.selectByPrincipal(principal);
    }
    @Override
    public Boolean addUser(User user){
        return mapper.addUser(user);
    }

    @Override
    public List<User> selectByKeyword(String column, String keyword) {
        return mapper.selectByKeyword(column, keyword);
    }
}
