package com.lpp.service;

import com.lpp.domain.Users;

import java.util.List;

/**
 * Created by tangcheng on 2017/2/22.
 */
public interface UsersService {
    void addUser(String name, Integer age);

    List<Users> getUsers();
}
