package structural.decorator;

public class PremiumDeliveryDecorator extends OrderDecorator {
    public PremiumDeliveryDecorator(Order order) {
        super(order);
    }

    @Override
    public double getCost() {
        return order.getCost()+500;
    }

    @Override
    public String getDescription() {
        return order.getDescription().concat(" Adding Premium Delivery");
    }
}
