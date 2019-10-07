package com.restapiproject.vehicles.dbl.query.implementation;

import com.mysema.query.jpa.impl.JPAQuery;
import com.restapiproject.vehicles.dbl.query.VehicleQuery;
import com.restapiproject.vehicles.dbo.entity.QVehicle;
import com.restapiproject.vehicles.dbo.wrapper.QVehicleWrapper;
import com.restapiproject.vehicles.dbo.wrapper.VehicleWrapper;
import com.restapiproject.vehicles.model.vo.VehicleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;

@Component
public class VehicleQueryImpl implements VehicleQuery {

    private final EntityManager entityManager;

    @Autowired
    public VehicleQueryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public VehicleVO getVehicle(Integer vehicleId) {
        JPAQuery jpaQuery = new JPAQuery(entityManager);

        QVehicle vehicle = QVehicle.vehicle;

        VehicleWrapper result = jpaQuery.from(vehicle)
                .where(vehicle.vehicleId.eq(vehicleId))
                .singleResult(new QVehicleWrapper(vehicle.vehicleId, vehicle.manufacturerName, vehicle.vehicleModel,
                        vehicle.registrationNumber, vehicle.isAvailable));

        if (result == null) return new VehicleVO();

        return result.get();
    }
}
