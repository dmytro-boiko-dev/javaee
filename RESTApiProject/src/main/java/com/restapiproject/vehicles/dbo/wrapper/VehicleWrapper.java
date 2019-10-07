package com.restapiproject.vehicles.dbo.wrapper;

import com.restapiproject.vehicles.model.vo.VehicleVO;
import com.mysema.query.annotations.QueryProjection;

public class VehicleWrapper extends AbstractWrapper<VehicleVO> {

    private final VehicleVO vehicleVO;

    @QueryProjection
    public VehicleWrapper(Integer vehicleId, String manufacturerName, String vehicleModel,
                          String registrationNumber, boolean isAvailable) {
        this.vehicleVO = new VehicleVO(vehicleId, manufacturerName, vehicleModel,
                registrationNumber, isAvailable);
    }

    @Override
    public VehicleVO get() {
        return vehicleVO;
    }
}
