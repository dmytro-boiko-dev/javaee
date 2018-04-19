package com.models;

import java.util.Objects;

public class Company {
    private int id;
    private String address;
    private String name;

    public Company(int id, String address, String name) {
        this.id = id;
        this.address = address;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Company company = (Company) object;
        return id == company.id &&
                Objects.equals(address, company.address) &&
                Objects.equals(name, company.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, address, name);
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
