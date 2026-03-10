public class ExceptionExample5 {
    public static void main(String[] args) {
        int age = 15;

        if(age < 18) {
            throw new ArithmeticException("Not eligible for voting");
        }
        else {
            System.out.println("Eligible for voting");
        }
    }
}
