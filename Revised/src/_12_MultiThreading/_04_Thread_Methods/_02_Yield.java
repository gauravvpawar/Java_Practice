package _12_MultiThreading._04_Thread_Methods;

class Student extends Thread
{
    String name;
    Student(String name)
    {
        this.name = name;
    }

    public void run()
    {
        for(int i = 1;i<=10;i++)
        {
            System.out.println(name +" " + " iteration : " + i);
            Thread.yield();
        }
    }
}

public class _02_Yield
{
    public static void main(String[] args) {
        /*
        yield method in thread class does not provide any exception
        yield method it used for current execution thread get into pause and give chance to execute another thread
         */

        Student s1 = new Student("A");
        Student s2 = new Student("B");

        s1.start();
        s2.start();
    }
}
