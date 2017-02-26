package com.lpp.restful;

import com.lpp.domain.Users;
import com.lpp.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by tangcheng on 2017/2/22.
 */
@RestController
@RequestMapping("user")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public ResponseEntity<String> addUser(String name, Integer age) {
        usersService.addUser(name, age);
        return ResponseEntity.ok("Success");
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ResponseEntity<List<Users>> getUsers() {
        List<Users> users = usersService.getUsers();
        return ResponseEntity.ok(users);
    }

}
