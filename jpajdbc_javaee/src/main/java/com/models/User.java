package com.models;

import java.util.Objects;

public class User {
    private int id;
    private String name;
    private String surname;
    private Company Company;

    public User(int id, String name, String surname, com.models.Company company) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        Company = company;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public com.models.Company getCompany() {
        return Company;
    }

    public void setCompany(com.models.Company company) {
        Company = company;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        User user = (User) object;
        return id == user.id &&
                Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname) &&
                Objects.equals(Company, user.Company);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, surname, Company);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", Company=" + Company +
                '}';
    }
}
