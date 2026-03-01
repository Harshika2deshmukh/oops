class Parent {
    void display() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    void display() {
        super.display();   // Calling parent method
        System.out.println("Child method");
    }
}

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
