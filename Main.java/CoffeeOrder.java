class CoffeeOrder {
   
    // Enscapsolation 
   
    
    private String coffeeName;
    private double price;
    private int quantity;

   
  //Constructor ang ginagamit para gumawa ng bagong order.

    CoffeeOrder(String coffeeName, double price, int quantity) {

        // Assign natin given values to the objects fields
        this.coffeeName = coffeeName;
        this.price = price;
        this.quantity = quantity;


    }

    // Differrent Method 

    public String getCoffeeName() {

        return coffeeName;


    }

    public double getPrice() {
        return price;

    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;

    }
    public void setPrice(double price) {
        this.price = price;
    }







}