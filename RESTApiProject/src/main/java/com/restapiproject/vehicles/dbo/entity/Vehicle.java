package com.restapiproject.vehicles.dbo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VEHICLE")
@Getter
@Setter
public class Vehicle {

    @Id
    @Column(name = "VEHICLEID")
    private Integer vehicleId;

    @Column(name = "MANUFACTURER_NAME")
    private String manufacturerName;

    @Column(name = "VEHICLE_MODEL")
    private String vehicleModel;

    @Column(name = "REG_NUMBER")
    private String registrationNumber;

    @Column(name = "AVAILABILITY")
    private boolean isAvailable;
}
