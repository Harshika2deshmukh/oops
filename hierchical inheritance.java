// Program to demonstrate Hierarchical Inheritance in Java

// Parent Class
class Employee {
    int empId;
    String empName;

    void getEmployee(int id, String name) {
        empId = id;
        empName = name;
    }

    void displayEmployee() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
    }
}

// Child Class 1
class Salary extends Employee {
    double basicSalary, hra, da, totalSalary;

    void calculateSalary(double basic) {
        basicSalary = basic;
        hra = 0.30 * basicSalary;
        da = 0.20 * basicSalary;
        totalSalary = basicSalary + hra + da;
    }

    void displaySalary() {
        displayEmployee();
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("Total Salary  : " + totalSalary);
    }
}

// Child Class 2
class Department extends Employee {
    String deptName;

    void setDepartment(String dept) {
        deptName = dept;
    }

    void displayDepartment() {
        displayEmployee();
        System.out.println("Department    : " + deptName);
    }
}

// Main Class
public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {

        // Object of Salary class
        Salary s = new Salary();
        s.getEmployee(101, "Trisha");
        s.calculateSalary(30000);
        s.displaySalary();

        System.out.println();

        // Object of Department class
        Department d = new Department();
        d.getEmployee(102, "Rahul");
        d.setDepartment("IT");
        d.displayDepartment();
    }
}

