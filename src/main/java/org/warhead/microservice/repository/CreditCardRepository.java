package org.warhead.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.warhead.microservice.model.CreditCard;

public interface CreditCardRepository extends JpaRepository<CreditCard,Integer> {
}
