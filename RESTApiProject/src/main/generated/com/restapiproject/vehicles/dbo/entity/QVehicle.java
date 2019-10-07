package com.restapiproject.vehicles.dbo.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QVehicle is a Querydsl query type for Vehicle
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QVehicle extends EntityPathBase<Vehicle> {

    private static final long serialVersionUID = 354642967L;

    public static final QVehicle vehicle = new QVehicle("vehicle");

    public final BooleanPath isAvailable = createBoolean("isAvailable");

    public final StringPath manufacturerName = createString("manufacturerName");

    public final StringPath registrationNumber = createString("registrationNumber");

    public final NumberPath<Integer> vehicleId = createNumber("vehicleId", Integer.class);

    public final StringPath vehicleModel = createString("vehicleModel");

    public QVehicle(String variable) {
        super(Vehicle.class, forVariable(variable));
    }

    public QVehicle(Path<? extends Vehicle> path) {
        super(path.getType(), path.getMetadata());
    }

    public QVehicle(PathMetadata<?> metadata) {
        super(Vehicle.class, metadata);
    }

}

