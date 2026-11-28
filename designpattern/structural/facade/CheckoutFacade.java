package structural.facade;

public class CheckoutFacade {
    private InventoryService inventoryService;
    private PaymentService paymentService;
    private ShippingService shippingService;
    private NotificationService notificationService;

    public CheckoutFacade(
            InventoryService inventoryService,
            PaymentService paymentService,
            ShippingService shippingService,
            NotificationService notificationService) {

        this.inventoryService = inventoryService;
        this.paymentService = paymentService;
        this.shippingService = shippingService;
        this.notificationService = notificationService;
    }

    public void placeOrder(
            String orderId,
            String productName,
            double amount) {

        // Step 1: Check stock
        boolean available =
                inventoryService.checkStock(productName);

        if (!available) {
            System.out.println("Product is out of stock!");
            return;
        }

        // Step 2: Process payment
        boolean paymentSuccessful =
                paymentService.processPayment(amount);

        if (!paymentSuccessful) {
            System.out.println("Payment failed!");
            return;
        }

        // Step 3: Reduce inventory
        inventoryService.reduceStock(productName);

        // Step 4: Create shipment
        shippingService.createShipment(orderId);

        // Step 5: Send confirmation
        notificationService.sendConfirmation(orderId);

        System.out.println("Order placed successfully!");
    }
}
