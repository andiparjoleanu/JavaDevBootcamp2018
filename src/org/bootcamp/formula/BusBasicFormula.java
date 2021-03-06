package org.bootcamp.formula;

import org.bootcamp.vehicle.Vehicle;

public class BusBasicFormula implements Formula {
    @Override
    public int calculate(Vehicle vehicle)
    {
        int cost = 200 * vehicle.getAge();
        cost += vehicle.isDiesel() ? 1000 : 0;

        if (vehicle.getNumberOfMiles() > 100000 && vehicle.getNumberOfMiles() < 200000) {
            cost += 500;
        }
        if (vehicle.getNumberOfMiles() > 200000) {
            cost += 1000;
        }
        return cost;
    }
}