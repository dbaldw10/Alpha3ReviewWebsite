package org.wecancoeit.reviews.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

//POJO

@Entity
public class Hashtag {

    @Id
    @GeneratedValue
    public long id;
    public String hashtagbody;


    @ManyToMany
    private Collection<Console> consoles;


    public Hashtag(String hashtagbody, Console...consoles) {
        this.hashtagbody = hashtagbody;
        this.consoles = new ArrayList<>();



    }

    private Hashtag() {
    }

    public long getId() {
        return id;
    }
    public void addConsole(Console console){
        consoles.add(console);
    }

    public Collection<Console> getConsoles() {
        return consoles;
    }

    public String getHashtagbody()
    {
        return hashtagbody;
    }
}


