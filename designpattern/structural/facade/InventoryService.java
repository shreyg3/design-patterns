package structural.facade;

public class InventoryService {

    public boolean checkStock(String productName) {
        System.out.println("Checking stock for " + productName);

        return true;
    }

    public void reduceStock(String productName) {
        System.out.println("Reducing stock for " + productName);
    }
}
