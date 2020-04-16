package com.mtechlabs.springboot.springit.model.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Vote {
    @Id
    @GeneratedValue
    private Long id;
   // private User user;
    private Link link;
    private int vote;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    @Override
    public String toString() {
        return "Vote{" +
                "id=" + id +
                ", link=" + link +
                ", vote=" + vote +
                '}';
    }
}
