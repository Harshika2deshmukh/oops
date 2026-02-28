class MathOperation {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        MathOperation m = new MathOperation();
        System.out.println(m.add(10, 20));
        System.out.println(m.add(10, 20, 30));
    }
}
