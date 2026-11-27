package structural.decorator;

public class Main {
    public static void main(String[] args) {

        Order order = new BasicOrder();

        order = new PremiumDeliveryDecorator(new GiftWrapDecorator(order));
        System.out.println(order.getDescription());
        System.out.println("Total Cost: ₹" + order.getCost());
    }
}
