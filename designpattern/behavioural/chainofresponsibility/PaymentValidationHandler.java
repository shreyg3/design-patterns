package behavioural.chainofresponsibility;

public class PaymentValidationHandler extends OrderHandler {


    @Override
    public boolean handle(Order order) {
        if (!order.isPaymentSuccessful()) {
            System.out.println("Payment Validation Failed");
            return true;
        }
        System.out.println("Payment Validation Successful");
        return handleNext(order);
    }
}
