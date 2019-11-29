package com.cumulus.dbl;

import com.cumulus.dbl.entity.JobCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface JobCardRepository extends JpaRepository<JobCard, Integer> {

    @Query(value = "EXECUTE PROCEDURE ADD_BLANK_JOBCARD(NULL, :VEHICLE_ID, NULL, NULL)", nativeQuery = true)
    void addJobCardProcedure(@Param("VEHICLE_ID") Integer vehicleId);
}
