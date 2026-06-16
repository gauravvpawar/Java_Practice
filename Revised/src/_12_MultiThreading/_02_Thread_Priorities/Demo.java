package _12_MultiThreading._02_Thread_Priorities;

class MyThread extends Thread {

    public void run() {
        System.out.println(
                Thread.currentThread().getName() +
                        " Priority: " +
                        Thread.currentThread().getPriority()
        );
    }
}

public class Demo {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setName("Low");
        t2.setName("Medium");
        t3.setName("High");

        t1.setPriority(1);
        t2.setPriority(5);
        t3.setPriority(10);

        t1.start();
        t2.start();
        t3.start();

        /* it gives all possibilities to thread execute simultaneously
        High Priority: 10
        Medium Priority: 5
        Low Priority: 1 output is unpredicted
         */
    }
}