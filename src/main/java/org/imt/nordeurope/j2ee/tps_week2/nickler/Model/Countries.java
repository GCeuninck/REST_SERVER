package org.imt.nordeurope.j2ee.tps_week2.nickler.Model;

import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class Countries {
    private List<TemperatureByCountry> temperatures;

    public Countries() {
        temperatures = new ArrayList<>();
        LocalDate today = LocalDate.now();
        LocalDate yesterday = LocalDate.now().minusDays(1);

        // Fr temperatures
        List<Temperature> tempFrCountry = new ArrayList<Temperature>();
        Temperature temp1FrCountry = new Temperature(8, today);
        Temperature temp2FrCountry = new Temperature(9, yesterday);
        tempFrCountry.add(temp1FrCountry);
        tempFrCountry.add(temp2FrCountry);

        TemperatureByCountry frCountry = new TemperatureByCountry("France", tempFrCountry);
        temperatures.add(frCountry);

        // En temperatures
        List<Temperature> tempEnCountry = new ArrayList<Temperature>();
        Temperature temp1EnCountry = new Temperature(15, today);
        Temperature temp2EnCountry = new Temperature(19, yesterday);
        tempEnCountry.add(temp1EnCountry);
        tempEnCountry.add(temp2EnCountry);

        TemperatureByCountry enCountry = new TemperatureByCountry("England", tempEnCountry);
        temperatures.add(enCountry);
    }

    public List<TemperatureByCountry> getTemperatures() {
        return temperatures;
    }

    public void setTemperatures(List<TemperatureByCountry> temperatures) {
        this.temperatures = temperatures;
    }


}
