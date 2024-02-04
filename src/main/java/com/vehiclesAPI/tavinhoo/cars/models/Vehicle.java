package com.vehiclesAPI.tavinhoo.cars.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter
@AllArgsConstructor
public class Vehicle {

    private Long id;
    private Integer Kilometers;
    private String color;
    private String description;
    private Boolean available;
    private Integer Year;
    private Model model;

}
