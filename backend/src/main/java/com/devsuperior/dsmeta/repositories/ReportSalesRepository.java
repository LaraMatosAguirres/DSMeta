package com.devsuperior.dsmeta.repositories;

import com.devsuperior.dsmeta.entities.ReportSales;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;

public interface ReportSalesRepository extends JpaRepository<ReportSales, Long> {

    @Query("SELECT obj FROM ReportSales obj WHERE obj.date BETWEEN :min AND :max ORDER BY obj.amount DESC")
    Page<ReportSales> findSales(LocalDate min, LocalDate max, Pageable pageable);
}
