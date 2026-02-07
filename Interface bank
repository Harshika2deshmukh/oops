interface Bank {
    float getRateOfInterest();
}

class SBI implements Bank {
    public float getRateOfInterest() {
        return 6.5f;
    }
}

class HDFC implements Bank {
    public float getRateOfInterest() {
        return 7.0f;
    }
}

public class Test {
    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        System.out.println(b.getRateOfInterest());

        b = new HDFC();
        System.out.println(b.getRateOfInterest());
    }
}
