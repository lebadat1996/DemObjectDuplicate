package com.codegym.testjwt.demo.config;

import com.codegym.testjwt.demo.service.IUserService;
import com.codegym.testjwt.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class ServiceConfig extends WebSecurityConfigurerAdapter {

    @Autowired

    private UserService userService;

}

