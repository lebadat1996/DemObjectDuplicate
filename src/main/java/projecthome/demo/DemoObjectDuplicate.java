package projecthome.demo;

import projecthome.demo.Entity.User;

import java.util.*;
import java.util.stream.Collectors;

public class DemoObjectDuplicate {
    public static void main(String[] args) {
        List<User> user = new ArrayList<>();
        user.add(new User("Nguyen Nhat", "nguyennhat@gmail.com","A"));
        user.add(new User("Le Van", "levan@gmail.com","B"));
        user.add(new User("Tran Khoa", "trankhoa@gmail.com","c"));
        user.add(new User("Le Vo", "levan@gmail.com","d"));
        user.add(new User("Ly Nguyen", "lynguyen@gmail.com","e"));
        Set<User> studentsWithoutDuplicate = user.stream()
                .collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(User::getPhone))));
        studentsWithoutDuplicate.forEach(s -> System.out.println(s.getPhone()));
    }
}
