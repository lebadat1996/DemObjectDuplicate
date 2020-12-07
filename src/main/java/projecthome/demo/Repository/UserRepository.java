package projecthome.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projecthome.demo.Entity.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
