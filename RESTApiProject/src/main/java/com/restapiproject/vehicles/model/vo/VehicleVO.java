package com.restapiproject.vehicles.model.vo;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonRootName("vehicle")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class VehicleVO {

    Integer id;
    String manufacturer;
    String model;
    String registrationNumber;
    boolean isAvailable;
}
