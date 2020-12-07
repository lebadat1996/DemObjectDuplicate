package projecthome.demo.Service;

import org.apache.catalina.LifecycleState;
import projecthome.demo.Entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAll();

    void save(User user);

    void update(User user);

    Optional<User> getById(Long id);

    void delete(Long id);
}
