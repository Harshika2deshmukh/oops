class Employee {
    int empId;
    String empName;
    double salary;

    // Parameterized Constructor
    Employee(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }

    // Method to display employee details
    void display() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary        : " + salary);
    }

    public static void main(String[] args) {

        // Creating object using parameterized constructor
        Employee e1 = new Employee(101, "Trisha", 35000);

        // Display details
        e1.display();
    }
}

