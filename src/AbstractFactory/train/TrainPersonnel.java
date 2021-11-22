package AbstractFactory.train;

import AbstractFactory.interfaces.Personnel;

public class TrainPersonnel implements Personnel {
    @Override
    public void addPersonnel() {
        System.out.println("Driver is in the cabin");
    }
}
