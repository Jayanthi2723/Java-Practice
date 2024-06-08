public class ItemToPurchase {
    // Private fields
    private String itemName;
    private int itemPrice;
    private int itemQuantity;

    // Default constructor
    public ItemToPurchase() {
        itemName = "none";
        itemPrice = 0;
        itemQuantity = 0;
    }

    // Public member methods (mutators & accessors)
    // Setters
    public void setName(String name) {
        itemName = name;
    }

    public void setPrice(int price) {
        itemPrice = price;
    }

    public void setQuantity(int quantity) {
        itemQuantity = quantity;
    }

    // Getters
    public String getName() {
        return itemName;
    }

    public int getPrice() {
        return itemPrice;
    }

    public int getQuantity() {
        return itemQuantity;
    }
}
