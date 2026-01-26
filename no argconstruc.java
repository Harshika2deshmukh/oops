class Student {
    int rollNo;
    String name;

    // No-Argument Constructor
    Student() {
        rollNo = 0;
        name = "Not Assigned";
    }

    // Method to display student details
    void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
    }

    public static void main(String[] args) {

        // Creating object using no-argument constructor
        Student s1 = new Student();

        // Display details
        s1.display();
    }
}
