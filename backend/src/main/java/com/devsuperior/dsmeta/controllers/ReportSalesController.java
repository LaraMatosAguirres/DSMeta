package com.devsuperior.dsmeta.controllers;

import com.devsuperior.dsmeta.entities.ReportSales;
import com.devsuperior.dsmeta.services.ReportSalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/report-sales")
public class ReportSalesController {

    @Autowired
    private ReportSalesService reportSalesService;

    @GetMapping
    public List<ReportSales> findAll(){
        return reportSalesService.findAll();
    }
}
