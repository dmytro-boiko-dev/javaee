package com.restapiproject.vehicles.dbl.repository;

import com.restapiproject.vehicles.dbo.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, Integer> {

}
