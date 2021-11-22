package factoryMethod;

public class Plane implements Transport {

    @Override
    public void actLikeTransport() {
        System.out.println("Plane flies");
    }
}
