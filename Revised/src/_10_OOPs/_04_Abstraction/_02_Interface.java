package _10_OOPs._04_Abstraction;

// interface through we can achieve 100 % abstraction
// in interface through we can achieve multiple inheritance
// the all method in interface is public and abstract
// In interface we just provide the method declaration
// method implementation provide in a child class

// e.g we have client requirement and this requirement complete by IT company
// in interface all the method by default method is public and abstract

interface ClientRequirement
{
    void greeting();
    void selectProduct();
    void payment();
    void receiptGenerate();
}

// in implemented class filled all the requirement
// in implement class provide all method is public to do not decrease the accessibility
class ITTeam implements ClientRequirement
{
    public  void greeting()
    {
        System.out.println("Welcome");
    }

    public void selectProduct()
    {
        System.out.println("select your product : ");
    }

    public void payment()
    {
        System.out.println("select your payment type");
    }

   public void receiptGenerate()
    {
        System.out.println("Receipt is generated");
    }
}


public class _02_Interface
{
    public static void main(String[] args) {
    // you can not create the object of interface
        ClientRequirement c1 = new ITTeam();

        c1.greeting();
        c1.selectProduct();
        c1.payment();
        c1.receiptGenerate();
    }
}
