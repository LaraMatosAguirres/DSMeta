package com.devsuperior.dsmeta.services;

import com.devsuperior.dsmeta.dtos.ReportSalesDTO;
import com.devsuperior.dsmeta.entities.ReportSales;
import com.devsuperior.dsmeta.repositories.ReportSalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

@Service
public class ReportSalesService {

    @Autowired
    private ReportSalesRepository repository;

    public Page<ReportSales> findAll(String minDate, String maxDate, Pageable pageable){

        LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());


        LocalDate min = minDate.equals("")? today.minusYears(1) : LocalDate.parse(minDate);
        LocalDate max = maxDate.equals("")? today : LocalDate.parse(maxDate);
        return repository.findSales(min, max, pageable);
    }
}
