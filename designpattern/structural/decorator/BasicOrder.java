package structural.decorator;

public class BasicOrder implements  Order{
    @Override
    public double getCost() {
        return 1000;
    }

    @Override
    public String getDescription() {
        return "Basic Order : ";
    }
}
