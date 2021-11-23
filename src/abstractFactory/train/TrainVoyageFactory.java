package abstractFactory.train;

import abstractFactory.interfaces.Equipment;
import abstractFactory.interfaces.Fuel;
import abstractFactory.interfaces.Personnel;
import abstractFactory.interfaces.VoyageFactory;

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
