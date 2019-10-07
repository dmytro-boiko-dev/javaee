package com.restapiproject.vehicles.dbl;

import com.restapiproject.BaseTest;
import com.restapiproject.vehicles.dbl.query.VehicleQuery;
import com.restapiproject.vehicles.model.vo.VehicleVO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertNotNull;

public class VehicleQueryTest extends BaseTest {

    @Autowired
    private VehicleQuery vehicleQuery;

    @Test
    private void testGetVehicle() {
        VehicleVO result = vehicleQuery.getVehicle(1);
        assertNotNull(result);
    }
}
