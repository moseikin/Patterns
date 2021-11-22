package factoryMethod.factory;

import factoryMethod.Train;
import factoryMethod.Transport;

public class TrainFactory implements TransportFactory {
    @Override
    public Transport makeTransport() {
        return new Train();
    }
}
