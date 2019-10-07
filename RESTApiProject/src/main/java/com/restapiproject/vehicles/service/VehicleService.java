package com.restapiproject.vehicles.service;

import com.restapiproject.vehicles.model.vo.DriverVO;
import com.restapiproject.vehicles.model.vo.VehicleVO;

public interface VehicleService {

    VehicleVO getVehicle(Integer vehicleId);

    DriverVO validateDriver(DriverVO driverVO);
}
