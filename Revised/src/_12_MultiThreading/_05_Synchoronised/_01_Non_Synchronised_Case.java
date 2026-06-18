package _12_MultiThreading._05_Synchoronised;

// when multiple thread access the same resource that might give output wrong
/*output 1 source access different user
Ticket booking sent
Umesh ticket booking started
Gaurav ticket booking started
Umesh ticket booked successfully
Gaurav ticket booked successfully
 */
//
class TicketCounter
{
    int  ticket  = 1; // only one ticket remain

    public void bookTicket(String name)
    {
        if(ticket > 0)
        {
            System.out.println(name + " ticket booking started");

            try {
                Thread.sleep(5000);
            }catch (Exception e) {}

            ticket--;
            System.out.println(name + " ticket booked successfully");
        }else{
            System.out.println(name + " Ticket booking failed");
        }
    }
}

class User extends Thread
{
    TicketCounter ticket;
    String name;

    User(String name , TicketCounter ticket)
    {
        this.name = name;
        this.ticket = ticket;
    }
    public void run()
    {
        ticket.bookTicket(name);
    }
}


public class _01_Non_Synchronised_Case
{
    public static void main(String[] args) {
        TicketCounter ticket = new TicketCounter();

        User u1 = new User("Gaurav" , ticket);
        User u2 = new User("Umesh" , ticket);

        u1.start();
        u2.start();

        System.out.println("Ticket booking sent");
    }
}
