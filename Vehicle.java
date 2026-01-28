class Vehicle {
    String brand = "Tata";

    void display() {
        System.out.println("Vehicle Brand: " + brand);
    }
}

class Car extends Vehicle {
    String brand = "Honda";

    void show() {
        super.display();
        System.out.println("Car Brand: " + brand);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.show();
    }
}

