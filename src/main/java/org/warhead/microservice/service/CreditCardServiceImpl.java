package org.warhead.microservice.service;

import org.springframework.stereotype.Service;
import org.warhead.microservice.model.CreditCard;
import org.warhead.microservice.repository.CreditCardRepository;

import java.util.Optional;

@Service
public class CreditCardServiceImpl implements CreditCardService {
    private final CreditCardRepository repo;

    public CreditCardServiceImpl(CreditCardRepository repo) {
        this.repo = repo;
    }

    @Override
    public Optional<CreditCard> getCardById(int id) {
        return repo.findById(id);
    }
}
