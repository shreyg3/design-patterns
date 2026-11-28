package structural.facade;

public class ShippingService {
    public void createShipment(String orderId) {
        System.out.println(
                "Creating shipment for " + orderId
        );
    }
}
