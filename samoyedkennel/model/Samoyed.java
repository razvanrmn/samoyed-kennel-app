package com.samoyedkennel.samoyedkennel.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Samoyed implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long id;
    private String name;
    private int born;
    private int gender;
    private String colour;
    private String coat;
    @Column(nullable = false, updatable = false)
    private String microchip;
    private String breeder;
    private String imageUrl;

    public Samoyed() {}

    public Samoyed(String name, int born, int gender, String colour, String coat, String microchip, String breeder, String imageUrl) {
        this.name = name;
        this.born = born;
        this.gender = gender;
        this.colour = colour;
        this.coat = coat;
        this.microchip = microchip;
        this.breeder = breeder;
        this.imageUrl = imageUrl;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBorn() {
        return born;
    }

    public void setBorn(int born) {
        this.born = born;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getCoat() {
        return coat;
    }

    public void setCoat(String coat) {
        this.coat = coat;
    }

    public String getMicrochip() {
        return microchip;
    }

    public void setMicrochip(String microchip) {
        this.microchip = microchip;
    }

    public String getBreeder() {
        return breeder;
    }

    public void setBreeder(String breeder) {
        this.breeder = breeder;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "SamoyedRepo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", born=" + born +
                ", gender=" + gender +
                ", colour='" + colour + '\'' +
                ", coat='" + coat + '\'' +
                ", microchip='" + microchip + '\'' +
                ", breeder='" + breeder + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }

}
