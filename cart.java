package facadepattern;

public class cart implements HotelService {
    private int numberOfCarts;

    public cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    @Override
    public void serviceExecute() {
        cartReq(numberOfCarts);
    }

    public void cartReq(int numberOfCarts) {
        System.out.println("Luggage cart request for " + numberOfCarts + " cart(s)." + "\n");
    }
}