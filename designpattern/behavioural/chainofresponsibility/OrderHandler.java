package behavioural.chainofresponsibility;

public abstract class OrderHandler {

    protected OrderHandler nextHandler;

    public void setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract boolean handle(Order order);

    protected boolean handleNext(Order order) {

        if (nextHandler == null) {
            return true;
        }

        return nextHandler.handle(order);
    }
}
