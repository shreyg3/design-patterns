package creational.factory;

public class NotificationFactory {


 public  static Notification getNotificationByType(String type){
     Notification notification =null;
     if("EMAIL".equals(type)) {
         notification = new EmailNotification();
     }
     return notification;
 }

}
