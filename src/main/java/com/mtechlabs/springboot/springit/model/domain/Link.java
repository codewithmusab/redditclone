package com.mtechlabs.springboot.springit.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Link extends Auditable {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String url;

    // comments
}
