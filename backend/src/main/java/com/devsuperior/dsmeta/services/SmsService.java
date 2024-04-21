package com.devsuperior.dsmeta.services;

import com.devsuperior.dsmeta.entities.ReportSales;
import com.devsuperior.dsmeta.repositories.ReportSalesRepository;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SmsService {

    @Value("${twilio.sid}")
    private String twilioSid;

    @Value("${twilio.key}")
    private String twilioKey;

    @Value("${twilio.phone.from}")
    private String twilioPhoneFrom;

    @Value("${twilio.phone.to}")
    private String twilioPhoneTo;

    @Autowired
    private ReportSalesRepository salesRepository;

    public void sendSms(Long id) {

        ReportSales reportSales = salesRepository.findById(id).get();

        String msg = "Vendedor: " + reportSales.getSellerName() + "Valor da compra: R$" + reportSales.getAmount();

        Twilio.init(twilioSid, twilioKey);

        PhoneNumber to = new PhoneNumber(twilioPhoneTo);
        PhoneNumber from = new PhoneNumber(twilioPhoneFrom);

        Message message = Message.creator(to, from, msg).create();

        System.out.println(message.getSid());
    }
}