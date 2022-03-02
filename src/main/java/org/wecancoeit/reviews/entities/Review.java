package org.wecancoeit.reviews.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.*;
import java.util.Collection;

//POJO

@Entity
public class Review {

    @Id
    @GeneratedValue
    public long id;
    public String name;
    public String reviewbody;


    @ManyToOne
    private Console console;


    public Review(String name, String reviewbody, Console console) {
        this.name = name;
        this.reviewbody = reviewbody;
        this.console = console;


    }

    private Review() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getReviewbody() {
        return reviewbody;
    }

}

