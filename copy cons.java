
class Student {
    int rollNo;
    String name;

    // Parameterized Constructor
    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    // Copy Constructor
    Student(Student s) {
        rollNo = s.rollNo;
        name = s.name;
    }

    // Method to display data
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name   : " + name);
    }

    public static void main(String[] args) {

        // Creating original object
        Student s1 = new Student(101, "Trisha");

        // Creating copy of object using copy constructor
        Student s2 = new Student(s1);

        System.out.println("Original Object:");
        s1.display();

        System.out.println("\nCopied Object:");
        s2.display();
    }
}

