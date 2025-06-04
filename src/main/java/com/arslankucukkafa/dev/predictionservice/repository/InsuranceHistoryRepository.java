package com.arslankucukkafa.dev.predictionservice.repository;

import com.arslankucukkafa.dev.predictionservice.entity.InsuranceHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceHistoryRepository extends JpaRepository<InsuranceHistory, Long> {

}
