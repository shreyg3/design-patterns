package structural.facade;

public class Main {
    public static void main(String[] args) {
        var inventoryService = new InventoryService();
        var notificationService = new NotificationService();
        var paymentService = new PaymentService();
        var shippingService = new ShippingService();
        var facade = new CheckoutFacade(inventoryService, paymentService,shippingService,notificationService);
        facade.placeOrder("100", "iPhone", 2000.0);
    }
}
