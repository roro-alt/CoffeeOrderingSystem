// inheratance na to Sub class
// Concepts neto ay : 
// Inheritance at Polymorphism (may sariling bersyon ng getRole()).
public class Costumer extends Person {

public Costumer(String name) {

    this.name = name;
}

// Polymorphism — ito na yung sariling bersyon ng Costumer
    // ng abstract method na getRole() mula sa Person
    @Override
    public String getRole() {
        return "Customer";
    }


    
}
