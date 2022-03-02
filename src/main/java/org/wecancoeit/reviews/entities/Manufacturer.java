package org.wecancoeit.reviews.entities;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Collection;
import java.util.Arrays;

@Entity
public class Manufacturer {

    @Id
    @GeneratedValue
    public long id;
    public String name;


    @ManyToMany
    private Collection<Console> consoles ;

    public Manufacturer(String name, Console...consoles) {
        this.name = name;
        this.consoles = Arrays.asList(consoles);
    }
    private Manufacturer() {

    }

    public void addConsole(Console console) {
        consoles.add(console);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public Collection<Console> getConsoles() {
        return consoles;
    }
}
