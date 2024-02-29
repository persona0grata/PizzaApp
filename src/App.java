import java.util.List;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();
        boolean ordering = true;

        while (ordering) {
            Menu.displayMainMenu();
            System.out.print("Choose an option: ");
            if (scanner.hasNextInt()) {
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        Menu.displayPizzaMenu();
                        System.out.print("Choose a pizza: ");
                        int pizzaChoice = Integer.parseInt(scanner.nextLine());
                        if (pizzaChoice == 1) {
                            order.addItem(ItemFactory.createItem("cheese pizza"));
                            System.out.println("Preparing Cheese Pizza...");
                        } else if (pizzaChoice == 2) {
                            order.addItem(ItemFactory.createItem("pepperoni pizza"));
                            System.out.println("Preparing Pepperoni Pizza...");
                        } else {
                            System.out.println("Invalid choice!");
                        }
                        break;


                    case 2:
                        Menu.displayBurgerMenu();
                        System.out.print("Choose a burger: ");
                        int burgerChoice = Integer.parseInt(scanner.nextLine());
                        Burger selectedBurger;
                        if (burgerChoice == 1) {
                            selectedBurger = new Hamburger();
                        } else if (burgerChoice == 2) {
                            selectedBurger = new Cheeseburger();
                        } else {
                            System.out.println("Invalid choice!");
                            continue;
                        }
                        //FOR ADDITIONAL OPTIONS
                        boolean additionalOptions = true;
                        while (additionalOptions) {
                            Menu.displayAdditionalOptions();
                            System.out.print("Choose additional option or skip: ");
                            int optionChoice = Integer.parseInt(scanner.nextLine());
                            switch (optionChoice) {
                                case 1:
                                    selectedBurger = new DoubleCheeseDecorator(selectedBurger);
                                    System.out.println("Added Double Cheese to Burger.");
                                    break;
                                case 2:
                                    selectedBurger = new NoOnionDecorator(selectedBurger);
                                    System.out.println("Added No Onion to Burger.");
                                    break;
                                case 3:
                                    additionalOptions = false;
                                    break;
                                default:
                                    System.out.println("Invalid choice!");
                            }
                        }
                        order.addItem(selectedBurger);
                        System.out.println("Preparing " + selectedBurger.getDescription() + "...");
                        break;


                    case 3:
                        Menu.displayDrinkMenu();
                        System.out.print("Choose a drink: ");
                        int drinkChoice = Integer.parseInt(scanner.nextLine());
                        if (drinkChoice == 1) {
                            order.addItem(ItemFactory.createItem("cola"));
                            System.out.println("Added Cola to order.");
                        } else if (drinkChoice == 2) {
                            order.addItem(ItemFactory.createItem("pepsi"));
                            System.out.println("Added Pepsi to order.");
                        } else if (drinkChoice == 3) {
                            order.addItem(ItemFactory.createItem("sprite"));
                            System.out.println("Added Sprite to order.");
                        } else {
                            System.out.println("Invalid choice!");
                        }
                        break;


                    case 4:
                        ordering = false;
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            } 
            
            else {
                System.out.println("Please enter a valid integer choice.");
                scanner.nextLine();
            }
        }

        System.out.println("Enter your delivery address:");
        String address = scanner.nextLine();
        order.setAddress(address);

        System.out.println("\nFinal Bill:");
        System.out.println("\nOrdered Items:");
        List<Item> items = order.getItems();
        for (Item item : items) {
            System.out.println("- " + item.getDescription() + ": " + item.getPrice() + " tenge");
        }
        double totalCost = order.calculateTotalCost();
        System.out.println("\nTotal cost: " + totalCost + " tenge");
        System.out.println("Delivery address: " + order.getAddress());
        System.out.println("Bon Appetit!");
    }
}
