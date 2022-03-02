package org.wecancoeit.reviews.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

//POJO

@Entity
public class Console {

    @Id
    @GeneratedValue
    public long id;
    public String name;
    private String manufacturer;
    private String releaseDate;
    private String type;
    private int rating;
    private String description;
    private String imgUrl;

    @OneToMany(mappedBy = "consoles")
    private Collection<Manufacturer> manufacturers ;

    @OneToMany(mappedBy = "console")
    private Collection<Review> reviews;

    @ManyToMany(mappedBy = "consoles")
    private Collection<Hashtag> hashtags;



    public Console(String name, String manufacturer, String releaseDate, String type, String description, String imgUrl, Review...reviews) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.releaseDate = releaseDate;
        this.type = type;
        this.imgUrl = imgUrl;
        this.rating = 0;
        this.description = description;
        this.reviews = Arrays.asList(reviews);
    }

    private Console() {
    }

    public Collection<Review> getReviews() {
        return reviews;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public long getId() {
        return id;
    }

    public Collection<Hashtag> getHashtags() {
        return hashtags;
    }


    public String getDescription() {
        return description;
    }

    public Collection<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public String getType() {
        return type;
    }


    public int getRating() {
        return rating;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
