package com.devsuperior.dsmeta.services;

import com.devsuperior.dsmeta.dtos.ReportSalesDTO;
import com.devsuperior.dsmeta.entities.ReportSales;
import com.devsuperior.dsmeta.repositories.ReportSalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportSalesService {

    @Autowired
    private ReportSalesRepository repository;

    public List<ReportSales> findAll(){
        return repository.findAll();
    }
}
