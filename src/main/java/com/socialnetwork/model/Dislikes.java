package com.socialnetwork.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
public class Dislikes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Timestamp createdTime;
    @ManyToOne
    @JoinColumn(name = "user")
    private App_User user;
    @ManyToOne
    @JoinColumn(name = "post")
    private Posts post;
    private String notification;
}
