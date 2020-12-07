package com.codegym.testjwt.demo.repository;

import com.codegym.testjwt.demo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {
    Role findRoleByName(String roleName);
}
