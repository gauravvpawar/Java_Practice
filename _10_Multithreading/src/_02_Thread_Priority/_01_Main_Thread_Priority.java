package _02_Thread_Priority;

class Student extends Thread
{
    public  void run()
    {
        for(int i = 0;i<5;i++)
        {
            System.out.println("Count print : " + i);
        }
    }
}

public class _01_Main_Thread_Priority
{
    public static void main(String[] args) {
        System.out.println("Priority of main thread : ");
        int num = Thread.currentThread().getPriority();
        System.out.println("Current thread priority " + num);
        String name = Thread.currentThread().getName();
        System.out.println("Current thread name : " + name);

        System.out.println("----------------------------thread priority--------------------------");
        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);

        Student s1 = new Student();
        Thread t1 = new Thread(s1);
        t1.setPriority(Thread.MAX_PRIORITY);

        s1.start();
    }
}
