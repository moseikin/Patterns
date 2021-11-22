package factoryMethod.factory;

import factoryMethod.transport.Plane;
import factoryMethod.transport.Transport;

public class PlaneFactory implements TransportFactory {
    @Override
    public Transport makeTransport() {
        return new Plane();
    }
}
