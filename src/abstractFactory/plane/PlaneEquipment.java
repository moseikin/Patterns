package abstractFactory.plane;

import abstractFactory.interfaces.Equipment;

public class PlaneEquipment implements Equipment {
    @Override
    public void addEquipment() {
        System.out.println("Plane is awaiting");
    }
}
