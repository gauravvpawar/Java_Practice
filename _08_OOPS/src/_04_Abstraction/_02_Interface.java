package _04_Abstraction;

// you just provide the declaration of the  method
interface ClientRequirement
{
    void isLoggedIn();
    void payment();
    void receiptGenerate();
    void PaymentHistory();
}

// you have to provide implementation inside  the child class
class ITTeam implements ClientRequirement
{

    public void  isLoggedIn()
    {
        System.out.println("user logged in check");
    }
    public void payment()
    {
        System.out.println("Payment proceed");
    }

    public void receiptGenerate()
    {
        System.out.println("Receipt generated");
    }

    public void PaymentHistory()
    {
        System.out.println("SHow history");
    }
}


public class _02_Interface
{
    public static void main(String[] args) {
        /*
            Interface through we can achieve multiple inheritance
            it is using 100 % abstraction
            in interface you cant create the object of interface class
            you just declare the method inside the interface all implementation provide inside the child class
            -- when you are going interface -------> class you have to use implements
            in interface all the method is 'public'
            and all the variable is 'public + static + final due to solving the ambiguity  problem'
         */

        // you can create a parent class reference variable and child class object
        // you can not create object of interface

        ClientRequirement c1 = new ITTeam();
        c1.isLoggedIn();
        c1.payment();
        c1.PaymentHistory();
        c1.receiptGenerate();
    }
}
