package structural.decorator;

public class GiftWrapDecorator extends OrderDecorator {
    public GiftWrapDecorator(Order order) {
        super(order);
    }

    @Override
    public double getCost() {
        return order.getCost() +500;
    }

    @Override
    public String getDescription() {
        return order.getDescription().concat(" Adding Gift Wrap : ");
    }
}
