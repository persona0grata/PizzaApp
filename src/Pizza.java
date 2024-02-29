class Pizza implements Item {
    private String type;
    private double price;

    public Pizza(String type, double price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return type + " Pizza";
    }
}