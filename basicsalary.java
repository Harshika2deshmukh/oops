class Employee {
    int empId;
    String name;
    double basicSalary;

    Employee(int id, String name, double salary) {
        empId = id;
        this.name = name;
        basicSalary = salary;
    }
}

class Salary extends Employee {
    Salary(int id, String name, double salary) {
        super(id, name, salary);
    }

    void calculateSalary() {
        double da = basicSalary * 0.92;
        double hra = basicSalary * 0.58;
        double total = basicSalary + da + hra;
        System.out.println("Total Salary: " + total);
    }
}

public class Main {
    public static void main(String[] args) {
        Salary s = new Salary(101, "Amit", 25000);
        s.calculateSalary();
    }
}


