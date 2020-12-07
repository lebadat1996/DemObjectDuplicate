package projecthome.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projecthome.demo.Entity.User;
import projecthome.demo.Service.UserService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity<?> listUser() {
        try {
            List<User> userList = userService.getAll();
            return new ResponseEntity<>(userList, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Không thành công", HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody User user) {
        try {
            userService.save(user);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Không thành công", HttpStatus.BAD_REQUEST);
        }
    }

}
