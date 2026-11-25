package creational.singleton;

public class OrderService {
    public void processOrder() {

        AppConfig config = AppConfig.getInstance();

        config.showConfig();

        System.out.println("Processing order...");
    }
}
