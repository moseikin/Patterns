package AbstractFactory.interfaces;

public interface VoyageFactory {

    Equipment getEquipment();

    Fuel getFuel();

    Personnel getPersonnel();
}
