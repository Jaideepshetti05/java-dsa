import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventoryManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> inventory = new HashMap<>();

        while (true) {
            System.out.println("\n===== Inventory Manager =====");
            System.out.println("1. Add Product");
            System.out.println("2. Update Quantity");
            System.out.println("3. Remove Product");
            System.out.println("4. Display Inventory");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Product Name: ");
                    String product = sc.nextLine();

                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();

                    inventory.put(product, qty);
                    System.out.println("Product Added.");
                    break;

                case 2:
                    System.out.print("Product Name: ");
                    product = sc.nextLine();

                    if (inventory.containsKey(product)) {
                        System.out.print("New Quantity: ");
                        qty = sc.nextInt();
                        inventory.put(product, qty);
                        System.out.println("Updated Successfully.");
                    } else {
                        System.out.println("Product Not Found.");
                    }
                    break;

                case 3:
                    System.out.print("Product Name: ");
                    product = sc.nextLine();

                    inventory.remove(product);
                    System.out.println("Removed Successfully.");
                    break;

                case 4:
                    System.out.println("\nInventory");
                    for (Map.Entry<String, Integer> item : inventory.entrySet()) {
                        System.out.println(item.getKey() + " : " + item.getValue());
                    }
                    break;

                case 5:
                    System.out.println("Thank You");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}