package com.restapiproject.vehicles.controllers;

import com.restapiproject.vehicles.model.vo.DriverVO;
import com.restapiproject.vehicles.model.vo.VehicleVO;
import com.restapiproject.vehicles.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class VehicleController {

    private final VehicleService vehicleService;

    @Autowired
    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @RequestMapping(value = "/vehicles/{vehicleId}", method = RequestMethod.GET)
    public VehicleVO getVehicle(@PathVariable("vehicleId") Integer vehicleId) {
        return vehicleService.getVehicle(vehicleId);
    }

    @RequestMapping(value = "/vehicles/driver", method = RequestMethod.POST)
    public DriverVO validateDriver(@RequestBody DriverVO driverVO){
        return vehicleService.validateDriver(driverVO);
    }
}
