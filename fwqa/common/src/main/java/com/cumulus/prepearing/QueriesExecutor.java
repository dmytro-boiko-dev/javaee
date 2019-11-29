package com.cumulus.prepearing;

import com.cumulus.dbl.JobCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QueriesExecutor {

    private final JobCardRepository jobCardRepository;

    @Autowired
    public QueriesExecutor(JobCardRepository jobCardRepository) {
        this.jobCardRepository = jobCardRepository;
    }

    public void execute() {
        Integer vehicleId = 1171; // 012 - E912 DRD
        jobCardRepository.addJobCardProcedure(vehicleId);
    }
}
