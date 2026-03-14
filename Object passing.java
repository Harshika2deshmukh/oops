class Test {
    int x;

    Test(int x) {
        this.x = x;
    }

    void display(Test t) {
        System.out.println("Value: " + t.x);
    }

    public static void main(String[] args) {
        Test t1 = new Test(10);
        t1.display(t1);
    }
}
