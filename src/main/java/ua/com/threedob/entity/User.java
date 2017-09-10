package ua.com.threedob.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Yurij on 17.08.2017.
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private int id;
    private String name;
    private String surName;
    private String email;
    private String password;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "user")
    private List<Purchase> purchase;

    public User(String name, String surName, String email, String password) {
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.password = password;
    }
}
