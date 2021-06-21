package com.capitalone.auto.hackathoncarbuyingdgs.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
@Data
public class Prequalification {

    @Id
    private String prequalificationApplicationId;

    @OneToOne
    private Customer borrower;

    @OneToOne
    private Customer coBorrower;

    @OneToMany
    private List<SavedVehicle> savedVehicle;

    @OneToMany
    private List<Offer> offers;
}
