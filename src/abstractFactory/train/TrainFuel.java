package abstractFactory.train;

import abstractFactory.interfaces.Fuel;

public class TrainFuel implements Fuel {
    @Override
    public void addFuel() {
        System.out.println("Coal is loaded");
    }
}
