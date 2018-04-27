package com.crud;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class UserEntityManager {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String email;

    public UserEntityManager(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public UserEntityManager() {
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}