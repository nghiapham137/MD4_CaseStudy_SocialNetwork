package com.socialnetwork.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class App_User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String fullName;
    @Column(columnDefinition = "TEXT")
    private String avatarUrl;
    private String email;
    private String address;
    private Integer sex;
    private boolean active;
    private String roles;

}
