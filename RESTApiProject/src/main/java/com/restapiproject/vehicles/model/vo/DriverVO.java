package com.restapiproject.vehicles.model.vo;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonRootName("driver")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DriverVO {

    Integer id;
    String name;
}
