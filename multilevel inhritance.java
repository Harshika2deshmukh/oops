class Person {
    String name;

    void setName(String n) {
        name = n;
    }

    void displayName() {
        System.out.println("Name : " + name);
    }
}

// Child Class (inherits Person)
class Student extends Person {
    int rollNo;

    void setRollNo(int r) {
        rollNo = r;
    }

    void displayRollNo() {
        System.out.println("Roll No : " + rollNo);
    }
}

// Child Class (inherits Student)
class Result extends Student {
    int marks;

    void setMarks(int m) {
        marks = m;
    }

    void displayResult() {
        displayName();
        displayRollNo();
        System.out.println("Marks : " + marks);
    }

    public static void main(String[] args) {
        Result r = new Result();

        r.setName("Trisha");
        r.setRollNo(101);
        r.setMarks(85);

        r.displayResult();
    }
}

