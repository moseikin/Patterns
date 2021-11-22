package AbstractFactory.plane;

import AbstractFactory.interfaces.Equipment;
import AbstractFactory.interfaces.Fuel;
import AbstractFactory.interfaces.Personnel;
import AbstractFactory.interfaces.VoyageFactory;

public class PlaneVoyageFactory implements VoyageFactory {
    @Override
    public Equipment getEquipment() {
        return new PlaneEquipment();
    }

    @Override
    public Fuel getFuel() {
        return new PlaneFuel();
    }

    @Override
    public Personnel getPersonnel() {
        return new PlanePersonnel();
    }
}
