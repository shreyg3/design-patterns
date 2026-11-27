package structural.adapter;

public class PaymentServiceAdapter implements PaymentService{
    private final ThirdPartyGateway paymentService;

    public PaymentServiceAdapter(ThirdPartyGateway paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public void pay(double amount) {
        paymentService.pay("Cash", amount);
    }
}
