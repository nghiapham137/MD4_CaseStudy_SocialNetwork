package com.socialnetwork.model;

//import com.socialnetwork.repository.post.PostRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String caption;
    @Column(columnDefinition = "TEXT")
    private String image;
    private Timestamp createdTime;
    private Timestamp modifiedTime;
    @ManyToOne
    @JoinColumn(name = "author")
    private App_User author;
    private String notification;

}
