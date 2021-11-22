package AbstractFactory.plane;

import AbstractFactory.interfaces.Personnel;

public class PlanePersonnel implements Personnel {
    @Override
    public void addPersonnel() {
        System.out.println("Pilot is in the aircraft cockpit");
    }
}
