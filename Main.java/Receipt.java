
import java.util.ArrayList;

public class Receipt {

    public void printReceipt(ArrayList<CoffeeOrder> orders, double total) {

        System.out.println("\n===== RECEIPT =====");

        for (CoffeeOrder order : orders) {
            System.out.println(order.getCoffeeName() + " - " + order.getPrice()
                    + " x " + order.getQuantity());
        }

        System.out.println("--------------------");
        System.out.println("TOTAL: " + total);
        System.out.println("=====================");
    }
}