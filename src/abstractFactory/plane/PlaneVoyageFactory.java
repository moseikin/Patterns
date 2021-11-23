package abstractFactory.plane;

import abstractFactory.interfaces.Equipment;
import abstractFactory.interfaces.Fuel;
import abstractFactory.interfaces.Personnel;
import abstractFactory.interfaces.VoyageFactory;

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
