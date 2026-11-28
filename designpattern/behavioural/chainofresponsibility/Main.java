package behavioural.chainofresponsibility;

public class Main {
    public static void main(String[] args) {

        OrderValidationHandler orderValidationHandler = new OrderValidationHandler();
        PaymentValidationHandler paymentValidationHandler = new PaymentValidationHandler();

        orderValidationHandler.setNextHandler(paymentValidationHandler);
        // Create order
        Order order = new Order(
                "ORDER101",
                "Laptop",
                2,
                60000,
                true,
                true
        );
        orderValidationHandler.handle(order);



    }
}
