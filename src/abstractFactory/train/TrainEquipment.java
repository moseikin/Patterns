package abstractFactory.train;

import abstractFactory.interfaces.Equipment;

public class TrainEquipment implements Equipment {
    @Override
    public void addEquipment() {
        System.out.println("Train is on the station");
    }
}
