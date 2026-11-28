package behavioural.chainofresponsibility;

public class Order {

    private String orderId;
    private String productName;
    private int quantity;
    private double amount;
    private boolean paymentSuccessful;
    private boolean suspicious;

    public Order(
            String orderId,
            String productName,
            int quantity,
            double amount,
            boolean paymentSuccessful,
            boolean suspicious) {

        this.orderId = orderId;
        this.productName = productName;
        this.quantity = quantity;
        this.amount = amount;
        this.paymentSuccessful = paymentSuccessful;
        this.suspicious = suspicious;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isPaymentSuccessful() {
        return paymentSuccessful;
    }

    public boolean isSuspicious() {
        return suspicious;
    }
}
