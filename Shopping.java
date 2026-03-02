// Interface 1
interface Payment {
    void pay(double amount);
}

// Interface 2
interface Refundable {
    void refund(double amount);
}

// Base Class (Encapsulation)
class Product {
    private String productName;
    private double price;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void displayProduct() {
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
    }
}

// Implementing Multiple Interfaces
class OnlineOrder extends Product implements Payment, Refundable {

    public OnlineOrder(String productName, double price) {
        super(productName, price);   // super keyword
    }

    // Overriding pay method
    @Override
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " successful via Online Mode.");
    }

    // Overriding refund method
    @Override
    public void refund(double amount) {
        System.out.println("Refund of " + amount + " processed successfully.");
    }
}

// Main Class
public class ShoppingSystem {
    public static void main(String[] args) {

        Product p1 = new OnlineOrder("Laptop", 55000);

        p1.displayProduct();

        // Runtime Polymorphism
        Payment payment = (Payment) p1;
        payment.pay(55000);

        Refundable ref = (Refundable) p1;
        ref.refund(2000);
    }
}
