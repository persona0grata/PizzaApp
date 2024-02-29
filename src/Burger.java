abstract class Burger implements Item {
    protected String name;
    protected double price;

    public Burger(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return name;
    }
}