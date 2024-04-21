package com.devsuperior.dsmeta.controllers;

import com.devsuperior.dsmeta.dtos.ReportSalesDTO;
import com.devsuperior.dsmeta.entities.ReportSales;
import com.devsuperior.dsmeta.services.ReportSalesService;
import com.devsuperior.dsmeta.services.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/report-sales")
public class ReportSalesController {

    @Autowired
    private ReportSalesService reportSalesService;

    @Autowired
    private SmsService smsService;

    @GetMapping
    public Page<ReportSales> findAll(@RequestParam(value="minDate", defaultValue = "") String minDate, @RequestParam(value="maxDate", defaultValue = "") String maxDate,  Pageable pageable){
        return reportSalesService.findAll(minDate, maxDate, pageable);
    }

    @GetMapping(value = "/{id}/notification")
    public void notifySMS(@PathVariable Long id){
        smsService.sendSms(id);
    }

}
