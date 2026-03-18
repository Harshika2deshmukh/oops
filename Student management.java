class Student {
    String name;
    int marks;

    Student(String n, int m) {
        name = n;
        marks = m;
    }

    void display() {
        System.out.println(name + " " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student("A", 80);
        Student s2 = new Student("B", 90);
        s1.display();
        s2.display();
    }
}
