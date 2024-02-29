class Menu {
    public static void displayMainMenu() {
        System.out.println("Welcome to Pizza Store!");
        System.out.println("Main Menu:");
        System.out.println("1. Add Pizza");
        System.out.println("2. Add Burger");
        System.out.println("3. Add Drink");
        System.out.println("4. Finish Order");
    }

    public static void displayPizzaMenu() {
        System.out.println("Pizza Menu:");
        System.out.println("1. Cheese Pizza: 3200 tenge");
        System.out.println("2. Pepperoni Pizza: 3000 tenge");
    }

    public static void displayBurgerMenu() {
        System.out.println("Burger Menu:");
        System.out.println("1. Hamburger: 2300 tenge");
        System.out.println("2. Cheeseburger: 2000 tenge");
    }

    public static void displayAdditionalOptions() {
        System.out.println("Additional Options:");
        System.out.println("1. Double Cheese: +300 tenge");
        System.out.println("2. No Onion: +100 tenge");
        System.out.println("3. Skip");
    }

    public static void displayDrinkMenu() {
        System.out.println("Drink Menu:");
        System.out.println("1. Cola: 350 tenge");
        System.out.println("2. Pepsi: 350 tenge");
        System.out.println("3. Sprite: 400 tenge");
    }
}