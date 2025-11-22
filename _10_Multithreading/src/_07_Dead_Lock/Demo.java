package _07_Dead_Lock;

class Library implements Runnable
{

    String book1 = new String("Java");
    String book2 = new String("Spring_boot");
    String book3 = new String("DBMS");
    public  void run()
    {

        String name = Thread.currentThread().getName();
            if(name.equals("Person1"))
            {
                try
                {
                    Thread.sleep(3000);
                    synchronized (book1)
                    {
                        System.out.println("Person 1 get book " + book1);
                        Thread.sleep(3000);

                        synchronized (book2)
                        {
                            System.out.println("Person 1 get book " + book2);
                            Thread.sleep(3000);

                            synchronized (book3)
                            {
                                System.out.println("Person 1 get book " + book3);
                                Thread.sleep(3000);
                            }
                        }
                    }
                }catch (Exception e)
                 {
                      System.out.println("Something went wrong");
                 }
            }else
            {
                try
                {
                    Thread.sleep(3000);
                    synchronized (book3)
                    {
                        System.out.println("Person 2 get book " + book3);
                        Thread.sleep(3000);
                        synchronized (book2)
                        {
                            System.out.println("Person 2 get book " + book2);
                            Thread.sleep(3000);

                            synchronized (book1)
                            {
                                System.out.println("Person 2 get book " + book1);
                                Thread.sleep(3000);
                            }
                        }
                    }
                }catch (Exception e)
                {
                    System.out.println("Something went wrong");
                }
            }
    }
}

public class Demo
{
    public static void main(String[] args) {
        /*
        dead lock is situation when thread become of process thread waiting is holding by the another process thread
        Process P1 holds Resource R1 and requests R2.
        Process P2 holds Resource R2 and requests R1.
         */


        Library l1 = new Library();
        Thread t1 = new Thread(l1);
        t1.setName("Person1");
        Thread t2 = new Thread(l1);
        t2.setName("Person2");

        t1.start();
        t2.start();

    }
}
