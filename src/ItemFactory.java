class ItemFactory {
    public static Item createItem(String type) {
        switch (type.toLowerCase()) {
            case "hamburger":
                return new Hamburger();
            case "cheeseburger":
                return new Cheeseburger();
            case "double cheese":
                return new DoubleCheeseDecorator(new Hamburger());
            case "no onion":
                return new NoOnionDecorator(new Hamburger());
            case "cola":
                return new Drink("Cola", 350.0); // 150 tenge
            case "pepsi":
                return new Drink("Pepsi", 350.0); // 150 tenge
            case "sprite":
                return new Drink("Sprite", 400.0); // 150 tenge
            case "cheese pizza":
                return new Pizza("Cheese", 3200.0); // 800 tenge
            case "pepperoni pizza":
                return new Pizza("Pepperoni", 3000.0); // 900 tenge
            default:
                return null;
        }
    }
}