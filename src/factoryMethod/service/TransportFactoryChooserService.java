package factoryMethod.service;

import factoryMethod.TransportEnum;
import factoryMethod.factory.PlaneFactory;
import factoryMethod.factory.TrainFactory;
import factoryMethod.factory.TransportFactory;

public class TransportFactoryChooserService {

    public TransportFactory choose(TransportEnum transportEnum){
        if (transportEnum.equals(TransportEnum.PLANE)) {
            return new PlaneFactory();
        } else if (transportEnum.equals(TransportEnum.TRAIN)) {
            return new TrainFactory();
        } else {
            throw new RuntimeException("no such transport");
        }
    }

}
