package com.codegym.testjwt.demo.service;

import com.codegym.testjwt.demo.model.User;
import com.codegym.testjwt.demo.model.UserPrinciple;
import com.codegym.testjwt.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public com.codegym.testjwt.demo.model.User save(com.codegym.testjwt.demo.model.User user) {
        return userRepository.save(user);
    }

    @Override
    public List<com.codegym.testjwt.demo.model.User> findAll() {
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return UserPrinciple.build(user);
    }
}
