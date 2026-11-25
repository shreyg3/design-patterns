package creational.builder;

public class Order {
    private final int orderId;
    private final String customerName;
    private final String productName;
    private final int quantity;
    private final String deliveryAddress;
    private final String paymentMethod;
    private final String couponCode;
    private final boolean giftWrapping;
    private final String instructions;

    private Order(Builder builder) {

        this.orderId = builder.orderId;
        this.customerName = builder.customerName;
        this.productName = builder.productName;
        this.quantity = builder.quantity;
        this.deliveryAddress = builder.deliveryAddress;
        this.paymentMethod = builder.paymentMethod;
        this.couponCode = builder.couponCode;
        this.giftWrapping = builder.giftWrapping;
        this.instructions = builder.instructions;
    }

    public static class Builder {

        // Mandatory fields
        private final int orderId;
        private final String customerName;
        private final String productName;

        // Optional fields with defaults
        private int quantity = 1;
        private String deliveryAddress;
        private String paymentMethod;
        private String couponCode;
        private boolean giftWrapping = false;
        private String instructions;

        // Constructor for mandatory fields
        public Builder(
                int orderId,
                String customerName,
                String productName
        ) {
            this.orderId = orderId;
            this.customerName = customerName;
            this.productName = productName;
        }

        // Methods for optional fields

        public Builder quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder deliveryAddress(String address) {
            this.deliveryAddress = address;
            return this;
        }

        public Builder paymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Builder couponCode(String couponCode) {
            this.couponCode = couponCode;
            return this;
        }

        public Builder giftWrapping(boolean giftWrapping) {
            this.giftWrapping = giftWrapping;
            return this;
        }

        public Builder instructions(String instructions) {
            this.instructions = instructions;
            return this;
        }

        // Final object creation
        public Order build() {

            if (quantity <= 0) {
                throw new IllegalArgumentException(
                        "Quantity must be greater than zero"
                );
            }

            if (deliveryAddress == null ||
                    deliveryAddress.isBlank()) {
                throw new IllegalStateException(
                        "Delivery address is required"
                );
            }

            if (paymentMethod == null ||
                    paymentMethod.isBlank()) {
                throw new IllegalStateException(
                        "Payment method is required"
                );
            }

            return new Order(this);
        }
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);
        System.out.println("Product: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Address: " + deliveryAddress);
        System.out.println("Payment: " + paymentMethod);
        System.out.println("Coupon: " + couponCode);
        System.out.println("Gift Wrapping: " + giftWrapping);
        System.out.println("Instructions: " + instructions);
    }
}
