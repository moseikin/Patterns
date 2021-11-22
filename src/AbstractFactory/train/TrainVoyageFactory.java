package AbstractFactory.train;

import AbstractFactory.interfaces.Equipment;
import AbstractFactory.interfaces.Fuel;
import AbstractFactory.interfaces.Personnel;
import AbstractFactory.interfaces.VoyageFactory;

public class TrainVoyageFactory implements VoyageFactory {
    @Override
    public Equipment getEquipment() {
        return new TrainEquipment();
    }

    @Override
    public Fuel getFuel() {
        return new TrainFuel();
    }

    @Override
    public Personnel getPersonnel() {
        return new TrainPersonnel();
    }
}
