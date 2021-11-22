package factoryMethod.factory;

import factoryMethod.Plane;
import factoryMethod.Transport;

public class PlaneFactory implements TransportFactory {
    @Override
    public Transport makeTransport() {
        return new Plane();
    }
}
