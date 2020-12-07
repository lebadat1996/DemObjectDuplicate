package com.codegym.testjwt.demo.service;

import com.codegym.testjwt.demo.model.Role;

import java.util.List;

public interface IRoleService {
    Role save(Role role);

    List<Role> findAll();

    Role findRoleByName(String name);
}
