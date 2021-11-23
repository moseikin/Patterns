package abstractFactory.train;

import abstractFactory.interfaces.Personnel;

public class TrainPersonnel implements Personnel {
    @Override
    public void addPersonnel() {
        System.out.println("Driver is in the cabin");
    }
}
