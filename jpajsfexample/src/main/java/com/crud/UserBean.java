package com.crud;

import javax.faces.bean.ManagedBean;
import java.util.Objects;

@ManagedBean(name = "userBean")
public class UserBean {
    private int id;
    private String name;
    private String email;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserBean userBean = (UserBean) o;
        return id == userBean.id &&
                Objects.equals(name, userBean.name) &&
                Objects.equals(email, userBean.email);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, email);
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
