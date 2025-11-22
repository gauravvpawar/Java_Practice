package _Task;

/*
synchronised key word is provide when multiple thread execute at same time and access the same resource tha may found error
in output we can solve by synchronised
 */

class Train
{
    int seatCount = 120;
    public synchronized void show(int x)
    {
        if(x < seatCount)
        {
            System.out.println(x + " Seat Booked .... by " + Thread.currentThread().getName());
            seatCount = seatCount - x;
            System.out.println("Remaining seat : " + seatCount);
        }else{
            System.out.println("Not enough space");
        }
    }
}

class Person extends Thread
{
    String name;
    int age;
    Train s1;
    int seatBookCount;

    Person(String name ,int  age,Train t ,  int seatBookCount )
    {
        this.name = name;
        this.age = age;
        this.s1 = t;
        this.seatBookCount = seatBookCount;
    }

    public void run()
    {
        Thread.currentThread().setName(name);
        s1.show(seatBookCount);
    }
}

public class _02_Train_Seat_Booking
{
    public static void main(String[] args) {
        Train t1 = new Train();

        Person p1 = new Person("Gaurav" ,22 , t1 , 10);
        Person p2 = new Person("Umesh", 25 , t1 , 30);
        Person p3 = new Person("Rahul" , 25, t1 , 100);

        p1.start();
        p2.start();
        p3.start();
    }
}
