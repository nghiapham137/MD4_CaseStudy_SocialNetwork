package com.socialnetwork.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Follow {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "follower")
    private App_User follower;

    @ManyToOne
    @JoinColumn(name = "followed_user")
    private App_User followedUser;
    private String notification;
}
