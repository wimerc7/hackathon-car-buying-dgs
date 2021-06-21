package com.capitalone.auto.hackathoncarbuyingdgs.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Offer {
    @Id
    private String offerId;
    private String lenderName;
}
