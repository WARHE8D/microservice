package org.warhead.microservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CreditCard {
    @Id
    private int id;
    private int cvv;
    private int expirationDate;
}
