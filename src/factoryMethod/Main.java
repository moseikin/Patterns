package factoryMethod;

import factoryMethod.factory.TransportFactory;
import factoryMethod.service.TransportFactoryChooserService;

public class Main {
    public static void main(String[] args) {
        TransportFactoryChooserService chooserService = new TransportFactoryChooserService();

        TransportFactory transportFactory = chooserService.choose(TransportEnum.TRAIN);
        Transport transport = transportFactory.makeTransport();
        transport.actLikeTransport();

        transportFactory = chooserService.choose(TransportEnum.PLANE);
        Transport transport1 = transportFactory.makeTransport();
        transport1.actLikeTransport();
    }
}
