package com.vehiclesAPI.tavinhoo.cars.controllers;

import com.vehiclesAPI.tavinhoo.cars.models.Manufacturer;
import com.vehiclesAPI.tavinhoo.cars.models.Model;
import com.vehiclesAPI.tavinhoo.cars.models.Vehicle;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {
    @GetMapping
    public List<Vehicle> index() {

        return List.of(
                new Vehicle(1L, 10000, "Azul", "Em bom estado.", true, 1987,
                        new Model(1L, "Fusca",
                        new Manufacturer(1L, "Wolkswagen")))
                );
    }

    @GetMapping("/{id}")
    public Vehicle show(@PathVariable("id") Long id) {
        return new Vehicle(1L, 10000, "Azul", "Em bom estado.", true, 1987,
                new Model(1L, "Fusca",
                        new Manufacturer(1L, "Wolkswagen")));
    }

    @PostMapping
    public Vehicle create(Vehicle vehicle) {
        return null;
    }

    @PutMapping("/{id}")
    public Vehicle update(@PathVariable("id") Long id, Vehicle vehicle) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id, Vehicle vehicle) {
    }
}
