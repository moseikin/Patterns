package AbstractFactory;

import AbstractFactory.interfaces.Equipment;
import AbstractFactory.interfaces.Fuel;
import AbstractFactory.interfaces.Personnel;
import AbstractFactory.interfaces.VoyageFactory;
import AbstractFactory.plane.PlaneVoyageFactory;
import AbstractFactory.train.TrainVoyageFactory;

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
