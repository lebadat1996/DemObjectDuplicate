package com.codegym.testjwt.demo.service;

import com.codegym.testjwt.demo.model.Role;
import com.codegym.testjwt.demo.repository.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements IRoleService {
    @Autowired
    private IRoleRepository roleRepository;

    @Override
    public Role save(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role findRoleByName(String name) {
        return roleRepository.findRoleByName(name);
    }
}
