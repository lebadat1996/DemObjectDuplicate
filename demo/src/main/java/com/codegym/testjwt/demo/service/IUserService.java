package com.codegym.testjwt.demo.service;


import com.codegym.testjwt.demo.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IUserService extends UserDetailsService {
    User save(User user);

    List<com.codegym.testjwt.demo.model.User> findAll();
}
