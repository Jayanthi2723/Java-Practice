// ItemToPurchase.java

public class ItemToPurchase {

    private String itemName = "none";
    private int itemPrice = 0;
    private int itemQuantity = 0;

    public ItemToPurchase() {
    }

    public void setName(String itemName) {
        this.itemName = itemName;
    }

    public String getName() {
        return itemName;
    }

    public void setPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getPrice() {
        return itemPrice;
    }

    public void setQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public int getQuantity() {
        return itemQuantity;
    }
}

// ShoppingCartPrinter.java

import java.util.Scanner;

public class ShoppingCartPrinter {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Prompt the user for two items
        System.out.println("Item 1");
        System.out.print("Enter the item name: ");
        String itemName1 = scnr.nextLine();
        System.out.print("Enter the item price: ");
        int itemPrice1 = scnr.nextInt();
        System.out.print("Enter the item quantity: ");
        int itemQuantity1 = scnr.nextInt();

        scnr.nextLine(); // Consume newline character

        System.out.println("Item 2");
        System.out.print("Enter the item name: ");
        String itemName2 = scnr.nextLine();
        System.out.print("Enter the item price: ");
        int itemPrice2 = scnr.nextInt();
        System.out.print("Enter the item quantity: ");
        int itemQuantity2 = scnr.nextInt();

        // Create two ItemToPurchase objects
        ItemToPurchase item1 = new ItemToPurchase();
        item1.setName(itemName1);
        item1.setPrice(itemPrice1);
        item1.setQuantity(itemQuantity1);

        ItemToPurchase item2 = new ItemToPurchase();
        item2.setName(itemName2);
        item2.setPrice(itemPrice2);
        item2.setQuantity(itemQuantity2);

        // Calculate the total cost
        int totalCost = item1.getPrice() * item1.getQuantity() + item2.getPrice() * item2.getQuantity();

        // Print the total cost
        System.out.println("TOTAL COST");
        System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice() + " = $" + item1.getPrice() * item1.getQuantity());
        System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice() + " = $" + item2.getPrice() * item2.getQuantity());
        System.out.println("Total: $" + totalCost);
    }
}
