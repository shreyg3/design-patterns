package behavioural.chainofresponsibility;

public class OrderValidationHandler extends OrderHandler {


    @Override
    public boolean handle(Order order) {
        if (!order.isSuspicious()) {
            System.out.println("Order Validation Failed");
            return true;
        }
        System.out.println("Order Validation Successful");
        return handleNext(order);
    }
}
