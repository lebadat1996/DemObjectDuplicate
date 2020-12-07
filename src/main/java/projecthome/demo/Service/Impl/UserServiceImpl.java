package projecthome.demo.Service.Impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projecthome.demo.Entity.User;
import projecthome.demo.Repository.UserRepository;
import projecthome.demo.Service.UserService;

import java.util.List;
import java.util.Optional;


@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void update(User user) {
        userRepository.save(user);
    }

    @Override
    public Optional<User> getById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
