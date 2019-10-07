package com.restapiproject.vehicles.dbo.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QDriver is a Querydsl query type for Driver
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QDriver extends EntityPathBase<Driver> {

    private static final long serialVersionUID = 1170731485L;

    public static final QDriver driver = new QDriver("driver");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public QDriver(String variable) {
        super(Driver.class, forVariable(variable));
    }

    public QDriver(Path<? extends Driver> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDriver(PathMetadata<?> metadata) {
        super(Driver.class, metadata);
    }

}

