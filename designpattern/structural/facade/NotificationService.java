package structural.facade;

public class NotificationService {
    public void sendConfirmation(String orderId) {
        System.out.println(
                "Sending order confirmation for " + orderId
        );
    }
}
