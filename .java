public class ExceptionExample2 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30};

        try {
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of range");
        }
    }
}
