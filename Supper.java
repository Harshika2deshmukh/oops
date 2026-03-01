class Parent {
    String name = "Harshika";
}

class Child extends Parent {
    String name = "Java";

    void show() {
        System.out.println(super.name); // Parent variable
    }
}

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
