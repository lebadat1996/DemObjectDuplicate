package projecthome.demo.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String phone;
    private String address;

    public User() {
    }

    public User( String userName, String phone, String address) {
        this.userName = userName;
        this.phone = phone;
        this.address = address;
    }
}
