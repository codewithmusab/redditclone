package com.mtechlabs.springboot.springit.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;

@Entity
public class Link extends Auditable {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String url;

    // comments

//    @OneToMany(mappedBy = "link")
//    private Link<Comment> comments=new ArrayList<>();
}
