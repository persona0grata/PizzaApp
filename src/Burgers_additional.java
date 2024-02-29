// BURGER TYPES
class Hamburger extends Burger {
    public Hamburger() {
        super("Hamburger", 2300.0); 
    }
}

class Cheeseburger extends Burger {
    public Cheeseburger() {
        super("Cheeseburger", 2000.0);
    }
}

// ADDITIONALS
class DoubleCheeseDecorator extends BurgerDecorator {
    public DoubleCheeseDecorator(Burger burger) {
        super(burger, "Double Cheese", 300.0);
    }
}

class NoOnionDecorator extends BurgerDecorator {
    public NoOnionDecorator(Burger burger) {
        super(burger, "No Onion", 100.0);
    }
}

// BURGER DECORATOR
abstract class BurgerDecorator extends Burger {
    protected Burger burger;

    public BurgerDecorator(Burger burger, String name, double price) {
        super(burger.name + " with " + name, burger.price + price);
        this.burger = burger;
    }
}