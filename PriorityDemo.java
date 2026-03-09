import java.util.Scanner;

class MyThread implements Runnable {
    int num;

    MyThread(int n) {
        num = n;
    }

    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("Thread Name: " + t.getName() +
                " Thread Number: " + num +
                " Priority: " + t.getPriority());
    }
}

public class PriorityDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter priority for Thread 1 (1-10):");
        int p1 = sc.nextInt();

        System.out.println("Enter priority for Thread 2 (1-10):");
        int p2 = sc.nextInt();

        System.out.println("Enter priority for Thread 3 (1-10):");
        int p3 = sc.nextInt();

        MyThread obj1 = new MyThread(1);
        MyThread obj2 = new MyThread(2);
        MyThread obj3 = new MyThread(3);

        Thread t1 = new Thread(obj1, "Thread-1");
        Thread t2 = new Thread(obj2, "Thread-2");
        Thread t3 = new Thread(obj3, "Thread-3");

        t1.setPriority(p1);
        t2.setPriority(p2);
        t3.setPriority(p3);

        t1.start();
        t2.start();
        t3.start();

        sc.close();
    }
}
