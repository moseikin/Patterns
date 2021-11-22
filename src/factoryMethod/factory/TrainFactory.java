package factoryMethod.factory;

import factoryMethod.transport.Train;
import factoryMethod.transport.Transport;

public class TrainFactory implements TransportFactory {
    @Override
    public Transport makeTransport() {
        return new Train();
    }
}
