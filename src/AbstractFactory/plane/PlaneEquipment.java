package AbstractFactory.plane;

import AbstractFactory.interfaces.Equipment;

public class PlaneEquipment implements Equipment {
    @Override
    public void addEquipment() {
        System.out.println("Plane is awaiting");
    }
}
