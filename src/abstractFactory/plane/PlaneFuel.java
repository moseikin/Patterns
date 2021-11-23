package abstractFactory.plane;

import abstractFactory.interfaces.Fuel;

public class PlaneFuel implements Fuel {

    @Override
    public void addFuel() {
        System.out.println("Kerosene flooded");
    }
}
