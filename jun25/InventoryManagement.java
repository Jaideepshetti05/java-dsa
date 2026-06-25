import java.util.HashMap;
import java.util.Map;

public class InventoryManagement {

    public static void main(String[] args) {

        HashMap<String, Integer> inventory = new HashMap<>();

        inventory.put("Keyboard", 15);
        inventory.put("Mouse", 20);
        inventory.put("Monitor", 10);

        System.out.println("Inventory:");

        for (Map.Entry<String, Integer> item : inventory.entrySet()) {
            System.out.println(item.getKey() + " : " + item.getValue());
        }

        inventory.put("Keyboard", inventory.get("Keyboard") + 5);

        System.out.println("\nAfter Update:");

        for (Map.Entry<String, Integer> item : inventory.entrySet()) {
            System.out.println(item.getKey() + " : " + item.getValue());
        }
    }
}