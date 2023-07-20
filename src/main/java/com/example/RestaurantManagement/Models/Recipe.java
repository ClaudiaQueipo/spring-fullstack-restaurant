package com.example.RestaurantManagement.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "recipes")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idrecipes;

    @Column(name = "information")
    private String information;

    @Column(name = "instruction")
    private String instruction;

    @Column(name = "photo")
    private String photo;

    public int getIdrecipes() {
        return idrecipes;
    }

    public void setIdrecipes(int idrecipes) {
        this.idrecipes = idrecipes;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
