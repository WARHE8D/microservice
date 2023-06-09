package org.warhead.microservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.warhead.microservice.model.CreditCard;
import org.warhead.microservice.service.CreditCardService;

import java.util.Optional;

@RestController
@RequestMapping(value = "v1/card")
public class CreditCardController {

    private final CreditCardService ser;

    public CreditCardController(CreditCardService ser) {
        this.ser = ser;
    }


    @GetMapping(value = "/cardById/{id}")
    public ResponseEntity<Optional<CreditCard>> getCardById(@PathVariable("id") int id){
        return new ResponseEntity<>(ser.getCardById(id), HttpStatus.OK);
    }
}
