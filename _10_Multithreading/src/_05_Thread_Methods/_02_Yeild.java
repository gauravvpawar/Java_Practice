package _05_Thread_Methods;

class Employee extends Thread
{
    private String name;

    Employee(String name)
    {
        this.name = name;
    }

    public void run()
    {
        for(int i = 1;i<=5;i++)
        {
            System.out.println(name + " Iteration : " + i);
            Thread.yield(); // it give chance to another thread to execute
        }
    }
}

public class _02_Yeild
{
    public static void main(String[] args) {
        /*
        yeild method in thread it does not provide any exception
        Yeild method is temporary pause the current execution thread  and give chance to execute another
         */

        Employee e1 = new Employee("A");
        Employee e2 = new Employee("B");

        e1.start();
        e2.start();
    }
}
