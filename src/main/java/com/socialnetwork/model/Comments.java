package com.socialnetwork.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(columnDefinition = "TEXT")
    private String content;
    private Timestamp createdTime;
    private Timestamp modifiedTime;
    @ManyToOne
    @JoinColumn(name = "sender")
    private App_User sender;
    @ManyToOne
    @JoinColumn(name = "post")
    private Posts post;
    private String notification;
}
