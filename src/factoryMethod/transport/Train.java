package factoryMethod.transport;

public class Train implements Transport {
    @Override
    public void actLikeTransport() {
        System.out.println("Train rides on rails");
    }
}
