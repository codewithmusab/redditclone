package com.mtechlabs.springboot.springit.model.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Comment {
    @Id
    @GeneratedValue
    private Long id;
    private String body;

    public Comment() {
    }
//private Link link;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", body='" + body + '\'' +
                '}';
    }
}
