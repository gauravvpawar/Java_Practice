package _02_Thread_Priority;

public class _02_Change_priority
{
    public static void main(String[] args) {
        /*
        In multithreading you can change the main method priority
         */
        System.out.println("Priority of main thread : ");
        int num = Thread.currentThread().getPriority();
        System.out.println("Current thread priority " + num);
        String name = Thread.currentThread().getName();
        System.out.println("Current thread name : " + name);

        System.out.println("--------------------------------changes in thread----------------------------------------");
        Thread.currentThread().setPriority(2);
        Thread.currentThread().setName("Execution thread");

        System.out.println("Priority of main thread : ");
        num = Thread.currentThread().getPriority();
        System.out.println("Current thread priority " + num);
        name = Thread.currentThread().getName();
        System.out.println("Current thread name : " + name);


    }
}
