
// Dito nagsisimula ang program.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);

        
        OrderManager manager = new OrderManager();

        int choice;

         
          System.out.println("\n=====================================" );
          System.out.println("\n     HELLO , COFFEE LOVER !  " );
          System.out.println("\n=====================================" );


        System.out.print("Enter your name: ");
        String customerName = sc.next();
        Costumer costumer = new Costumer(customerName);

    System.out.println("\nWelcome, " + costumer.getName() + "!");



           do {

           // Dito  natin makita kung gumana yung inheratance sa CostumergetName

    System.out.println("\n====== COFFEE ORDERING SYSTEM =====");
    System.out.println("Customer: " + costumer.getName());
    System.out.println("1. Add Order");
    System.out.println("2. View Orders");
    System.out.println("3. Search Order");
    System.out.println("4. Update Order");
    System.out.println("5. Delete Order");
    System.out.println("6. Calculate Total");
    System.out.println("7. Exit");

    System.out.print("Enter your choice: ");
    choice = sc.nextInt();

    switch (choice) {

    case 1:
    // ADD ORDER

    String[] coffeeNames = {"Matcha", "Milo", "Oreo", "Vanilla","Capucchino"};
    double[] prices = {120, 100, 130, 110,125};

    // Display coffee menu
    System.out.println("\n===== COFFEE MENU =====");

    for (int i = 0; i < coffeeNames.length; i++) {
        System.out.println((i + 1) + ". " + coffeeNames[i] + " - " + prices[i]);
    }

    // Choose coffee
    System.out.print("Choose coffee: ");
    int coffeeChoice = sc.nextInt();

    // Get selected coffee and price
    String coffeeName = coffeeNames[coffeeChoice - 1];
    double price = prices[coffeeChoice - 1];

    // Get quantity
    System.out.print("Enter quantity: ");
    int quantity = sc.nextInt();

    // Create CoffeeOrder object
    CoffeeOrder order = new CoffeeOrder(coffeeName, price, quantity);

    // Add order to ArrayList
    manager.addOrder(order);

    System.out.println("Order added successfully!");

    break;

    case 2:
        // View Orders
        manager.viewOrders();

        break;

    case 3:
    // Search Order
    System.out.print("Enter coffee name to search: ");
    String searchName = sc.next();
    manager.searchOrder(searchName);

    break;
   case 4:
    // Update Order
    System.out.print("Enter coffee name to update: ");
    String updateName = sc.next();

    System.out.print("Enter new quantity: ");
    int newQuantity = sc.nextInt();

    manager.updateOrder(updateName, newQuantity);
    System.out.println("Order updated successfully!");

    break;

   case 5:
    // Delete Order
    System.out.print("Enter coffee name to delete: ");
    String deleteName = sc.next();

    manager.deleteOrder(deleteName);
    System.out.println("Order deleted successfully!");

    break;

    case 6:
    // Calculate Total
    double total = manager.calculateTotal();
    Receipt receipt = new Receipt();
    receipt.printReceipt(manager.getOrders(), total);

    break;

    case 7:
        System.out.println("Thank you for using Coffee System !" + "Have a GoodDay ! ");
        break;

    default:
        System.out.println("Invalid choice!");

}



      } while (choice != 7);

      
    }
}