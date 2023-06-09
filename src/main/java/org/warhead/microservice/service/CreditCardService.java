package org.warhead.microservice.service;

import org.warhead.microservice.model.CreditCard;

import java.util.Optional;

public interface CreditCardService {
    Optional<CreditCard> getCardById(int id);
}
