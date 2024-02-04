package com.vehiclesAPI.tavinhoo.cars.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Model {

    private Long id;
    private String name;
    private Manufacturer manufacturer;


}
