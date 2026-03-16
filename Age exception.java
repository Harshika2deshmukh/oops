package q818;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new InvalidAgeException("Not eligible to vote");
            } else {
                System.out.println("Eligible to vote");
            }
        } 
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
