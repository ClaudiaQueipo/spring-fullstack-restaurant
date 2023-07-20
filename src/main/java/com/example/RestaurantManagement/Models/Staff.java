package com.example.RestaurantManagement.Models;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "staff")
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String role;

    @Column(name = "apparatus_employed")
    private Date apparatusEmployed;

    @Column(name = "dismissal_from_work")
    private Date dismissalFromWork;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getApparatusEmployed() {
        return apparatusEmployed;
    }

    public void setApparatusEmployed(Date apparatusEmployed) {
        this.apparatusEmployed = apparatusEmployed;
    }

    public Date getDismissalFromWork() {
        return dismissalFromWork;
    }

    public void setDismissalFromWork(Date dismissalFromWork) {
        this.dismissalFromWork = dismissalFromWork;
    }
}
