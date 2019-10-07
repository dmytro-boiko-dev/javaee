package com.restapiproject.vehicles.service.implementation;

import com.restapiproject.vehicles.dbl.query.VehicleQuery;
import com.restapiproject.vehicles.dbl.repository.DriverRepository;
import com.restapiproject.vehicles.dbo.entity.Driver;
import com.restapiproject.vehicles.model.vo.DriverVO;
import com.restapiproject.vehicles.model.vo.VehicleVO;
import com.restapiproject.vehicles.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService {

    private final VehicleQuery vehicleQuery;
    private final DriverRepository driverRepository;

    @Autowired
    public VehicleServiceImpl(VehicleQuery vehicleQuery, DriverRepository driverRepository) {
        this.vehicleQuery = vehicleQuery;
        this.driverRepository = driverRepository;
    }

    @Override
    public VehicleVO getVehicle(Integer vehicleId) {

        if (vehicleId == null) return new VehicleVO();
        return vehicleQuery.getVehicle(vehicleId);
    }

    @Override
    public DriverVO validateDriver(DriverVO driverVO) {
        if (driverVO.getId() == null || driverVO.getName() == null) {
            return driverVO;
        }

        Optional<Driver> foundDriver = driverRepository.findById(driverVO.getId());
        if (!foundDriver.isPresent()) return driverVO;

        Driver driver = foundDriver.get();
        driverVO.setId(driver.getId());
        driverVO.setName(driver.getName());

        return driverVO;
    }
}
