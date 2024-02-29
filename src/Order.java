import java.util.ArrayList;
import java.util.List;

class Order {
    private List<Item> items;
    private String address;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Item> getItems() {
        return items;
    }

    public String getAddress() {
        return address;
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (Item item : items) {
            totalCost += item.getPrice();
        }
        return totalCost;
    }
}