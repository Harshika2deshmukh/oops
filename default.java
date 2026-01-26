// Program to demonstrate Default Constructor in Java

class Student {
    int rollNo;
    String name;

    // Default Constructor
    Student() {
        rollNo = 1;
        name = "Trisha";
    }

    // Method to display details
    void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
    }

    public static void main(String[] args) {

        // Object creation (default constructor is called automatically)
        Student s = new Student();
        s.display();
    }
}

