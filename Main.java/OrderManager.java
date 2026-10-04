// OrderManager ay manager/controller
// Ito yung "utak" ng listahan ng orders

import java.util.ArrayList;

public class OrderManager {

    private ArrayList<CoffeeOrder> orders;

    public OrderManager() {
        orders = new ArrayList<>();
    }

    public void addOrder(CoffeeOrder order) {
        orders.add(order);
    }

    // View Order
    public void viewOrders() {
        for (CoffeeOrder order : orders) {
            System.out.println(order.getCoffeeName() + " - " + order.getPrice() + " x " + order.getQuantity());
        }
    }

    // Search
public void searchOrder(String coffeeName) {
    boolean found = false;

    for (CoffeeOrder order : orders) {
        if (order.getCoffeeName().equals(coffeeName)) {
            System.out.println("Order Found!");
            System.out.println("Coffee: " + order.getCoffeeName());
            System.out.println("Price: " + order.getPrice());
            System.out.println("Quantity: " + order.getQuantity());
            found = true;
        }
    }

    if (!found) {
        System.out.println("Order not found.");
    }
}

// Update Order
public void updateOrder(String coffeeName, int newQuantity) {
    boolean found = false;

    for (CoffeeOrder order : orders) {
        if (order.getCoffeeName().equals(coffeeName)) {
            order.setQuantity(newQuantity);
            found = true;
        }
    }

    if (!found) {
        System.out.println("Order not found. Nothing was updated.");
    }
}

// Delete Order
public void deleteOrder(String coffeeName) {
    boolean found = false;

    for (int i = 0; i < orders.size(); i++) {
        if (orders.get(i).getCoffeeName().equals(coffeeName)) {
            orders.remove(i);
            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println("Order not found. Nothing was deleted.");
    }
}
    // Calculate Total
    public double calculateTotal() {
        double total = 0;
        for (CoffeeOrder order : orders) {
            double subtotal = order.getPrice() * order.getQuantity();
            total = total + subtotal;
        }
        return total;
    }

    public ArrayList<CoffeeOrder> getOrders() {
        return orders;
    }
}