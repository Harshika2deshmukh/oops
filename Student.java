class Student {
    int rollNo;
    String name;

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }
}

class Marks extends Student {
    int m1, m2, m3;

    Marks(int r, String n, int a, int b, int c) {
        super(r, n);
        m1 = a;
        m2 = b;
        m3 = c;
    }
}

class Result extends Marks {
    Result(int r, String n, int a, int b, int c) {
        super(r, n, a, b, c);
    }

    void display() {
        int total = m1 + m2 + m3;
        System.out.println("Total Marks: " + total);
    }
}

public class Main {
    public static void main(String[] args) {
        Result r = new Result(1, "Neha", 78, 85, 90);
        r.display();
    }
}

