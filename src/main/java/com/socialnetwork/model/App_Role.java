package com.socialnetwork.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class App_Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;


}
