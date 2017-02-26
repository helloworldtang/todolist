package com.lpp.service;

import com.lpp.domain.Users;
import com.lpp.domain.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tangcheng on 2017/2/22.
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public void addUser(String name, Integer age) {
        Users users = new Users();
        users.setName(name);
        users.setAge(age);
        usersRepository.saveAndFlush(users);
    }

    @Override
    public List<Users> getUsers() {
        return usersRepository.findAll();
    }
}
