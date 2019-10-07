package com.restapiproject.vehicles.dbo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "DRIVER")
@Getter
@Setter
public class Driver {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME")
    private String name;
}
