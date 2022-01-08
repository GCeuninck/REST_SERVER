package org.imt.nordeurope.j2ee.tps_week2.nickler.Controller;

import org.imt.nordeurope.j2ee.tps_week2.nickler.Model.Countries;
import org.imt.nordeurope.j2ee.tps_week2.nickler.Model.TemperatureByCountry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TemperatureRestController {

    @Autowired
    Countries countries;

    @GetMapping(value = "/temperature", produces = {"application/json"})
    public Countries getAll() {
        return countries;
    }

    @GetMapping(value = "/temperature/{country}", produces = {"application/json"})
    public TemperatureByCountry getCountryTemperature(@PathVariable(value = "country") String country ) {
        for (TemperatureByCountry temperatureByCountry : countries.getTemperatures()) {
            if (temperatureByCountry.getCountry().equals(country)) {
                return temperatureByCountry;
            }
        }
        return null;
    }
}
