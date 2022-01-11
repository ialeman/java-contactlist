package com.contact.javacontactlist.controller;

import com.contact.javacontactlist.dao.UsersDao;
import com.contact.javacontactlist.models.ContactEntity;
import com.contact.javacontactlist.models.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsersController {

    @Autowired
    protected UsersDao usersDao;

    @RequestMapping(value = "api/user/{userId}", method = RequestMethod.GET)
    public UserEntity login(@PathVariable Integer userId) {
        return usersDao.getUserById(userId);
    }

    @RequestMapping(value = "api/login/{username}", method = RequestMethod.POST)
    public UserEntity getByUsername(@PathVariable String username) {
        return usersDao.getUserByUsername(username);
    }

    @RequestMapping(value = "api/username/encrypt/{password}", method = RequestMethod.GET)
    public String encrypt(@PathVariable String password) {
        return new BCryptPasswordEncoder().encode(password);
    }

}
