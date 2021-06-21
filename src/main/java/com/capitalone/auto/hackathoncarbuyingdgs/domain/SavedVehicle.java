package com.capitalone.auto.hackathoncarbuyingdgs.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class SavedVehicle {

    @Id
    private Long saveVehicleId;
    private String make;
    private String model;
    private String color;
    private String year;

}
