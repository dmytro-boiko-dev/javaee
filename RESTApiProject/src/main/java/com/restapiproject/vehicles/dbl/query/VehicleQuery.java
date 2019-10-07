package com.restapiproject.vehicles.dbl.query;

import com.restapiproject.vehicles.model.vo.VehicleVO;

public interface VehicleQuery {

    VehicleVO getVehicle(Integer vehicleId);
}
