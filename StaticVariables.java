class Employee {
    String name;
    int id;
    // Static variable shared by all instances
    static int employeeCount = 0;

    // Constructor
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        // Increment the shared counter every time a new object is made
        employeeCount++;
    }

    // Static method to display the count
    static void displayTotalEmployees() {
        System.out.println("Total Employees in System: " + employeeCount);
    }
}

public class EmployeeTracker {
    public static void main(String[] args) {
        // Creating multiple employee objects
        Employee emp1 = new Employee("Alice", 101);
        Employee emp2 = new Employee("Bob", 102);
        Employee emp3 = new Employee("Charlie", 103);

        // Accessing the static method
        Employee.displayTotalEmployees();
    }
}
