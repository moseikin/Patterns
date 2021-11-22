package AbstractFactory.plane;

import AbstractFactory.interfaces.Fuel;

public class PlaneFuel implements Fuel {

    @Override
    public void addFuel() {
        System.out.println("Kerosene flooded");
    }
}
