package abstractFactory;

import abstractFactory.interfaces.Equipment;
import abstractFactory.interfaces.Fuel;
import abstractFactory.interfaces.Personnel;
import abstractFactory.interfaces.VoyageFactory;
import abstractFactory.plane.PlaneVoyageFactory;
import abstractFactory.train.TrainVoyageFactory;

public class Main {

    public static void main(String[] args) {
        VoyageFactory voyageFactory = new TrainVoyageFactory();
        Equipment equipment = voyageFactory.getEquipment();
        Personnel personnel = voyageFactory.getPersonnel();
        Fuel fuel = voyageFactory.getFuel();
        equipment.addEquipment();
        personnel.addPersonnel();
        fuel.addFuel();
        System.out.println("Starting train voyage");

        System.out.println("\n");

        voyageFactory = new PlaneVoyageFactory();
        equipment = voyageFactory.getEquipment();
        personnel = voyageFactory.getPersonnel();
        fuel = voyageFactory.getFuel();
        equipment.addEquipment();
        personnel.addPersonnel();
        fuel.addFuel();
        System.out.println("Starting plane voyage");
    }
}
