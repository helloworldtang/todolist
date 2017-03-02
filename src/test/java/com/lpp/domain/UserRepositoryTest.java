package com.lpp.domain;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by tangcheng on 2017/3/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private RoleRepository roleRepository;


}