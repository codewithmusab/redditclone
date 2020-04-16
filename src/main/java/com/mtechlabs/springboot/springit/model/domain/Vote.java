package com.mtechlabs.springboot.springit.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vote  extends Auditable{

    @Id
    @GeneratedValue
    private Long id;
   // private User user;
   // private Link link;
    private int vote;

}
