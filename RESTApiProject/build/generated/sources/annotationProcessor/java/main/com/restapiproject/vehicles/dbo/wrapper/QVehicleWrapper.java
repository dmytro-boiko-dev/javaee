package com.restapiproject.vehicles.dbo.wrapper;

import com.mysema.query.types.expr.*;

import com.mysema.query.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * com.restapiproject.vehicles.dbo.wrapper.QVehicleWrapper is a Querydsl Projection type for VehicleWrapper
 */
@Generated("com.mysema.query.codegen.ProjectionSerializer")
public class QVehicleWrapper extends ConstructorExpression<VehicleWrapper> {

    private static final long serialVersionUID = -1374873416L;

    public QVehicleWrapper(com.mysema.query.types.Expression<Integer> vehicleId, com.mysema.query.types.Expression<String> manufacturerName, com.mysema.query.types.Expression<String> vehicleModel, com.mysema.query.types.Expression<String> registrationNumber, com.mysema.query.types.Expression<Boolean> isAvailable) {
        super(VehicleWrapper.class, new Class[]{int.class, String.class, String.class, String.class, boolean.class}, vehicleId, manufacturerName, vehicleModel, registrationNumber, isAvailable);
    }

}

