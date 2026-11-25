package creational.factory;

public class NotificationService {

    public static void sendNotification(String type, String message) {
        var notification = NotificationFactory.getNotificationByType(type);
        notification.send(message);

    }
}
