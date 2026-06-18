package _12_MultiThreading._07_Dead_Lock_Situation;

class Library implements Runnable
{
    String book1 = new String("Math");
    String book2 = new String("Physics");
    String book3 = new String("Chemistry");

    public void run()
    {
//        System.out.println(Thread.currentThread().getName());
        String name = Thread.currentThread().getName();

        if(name.equals("Person1"))
        {
            try
            {
                Thread.sleep(2000);

                synchronized (book1)
                {
                    System.out.println("Person 1 get book1 " + book1);
                    Thread.sleep(2000);

                    synchronized (book2)
                    {
                        System.out.println("Person 1 get book2  " + book2);
                        Thread.sleep(2000);

                        synchronized (book3)
                        {
                            System.out.println("Person 1 get book3 " +book3);
                        }
                    }
                }


            }catch (Exception e)
            {
                System.out.println("Exception occur");
            }
        }else{
            try{
                Thread.sleep(2000);

                synchronized (book3)
                {
                    System.out.println("Person 2 get book3 "+ book3);
                    Thread.sleep(2000);

                    synchronized (book2)
                    {
                        System.out.println("Person 2 get book2 "+book2);
                        Thread.sleep(2000);

                        synchronized (book1)
                        {
                            System.out.println("Person 2 get book1 " + book1);
                        }
                    }
                }
            }catch (Exception e)
            {
                System.out.println("Exception occur in person 2");
            }
        }
    }
}


public class Main
{
    public static void main(String[] args) {
        /*
        Dead lock occurs when two object access the same resource
        process p1 hold resource r1 and request for r2
        process p2 hold resource r2 and request for r1
         */

        Library l = new Library();
        Thread t1 = new Thread(l);
        Thread t2 = new Thread(l);

        t1.setName("Person1");
        t2.setName("Person2");

        t1.start();
        t2.start();
    }
}
