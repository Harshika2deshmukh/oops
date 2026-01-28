class Shape {
    void area() {
        System.out.println("Area not defined");
    }
}

class Rectangle extends Shape {
    int l, b;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    void area() {
        System.out.println("Rectangle Area: " + (l * b));
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s = new Rectangle(10, 5);
        s.area();
    }
}

