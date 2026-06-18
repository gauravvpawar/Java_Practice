package _12_MultiThreading._05_Synchoronised;

class BankAccount {
    int balance = 1000;

    synchronized public void withdraw(String name, int amount) {
        if (balance >= amount) {
            System.out.println(name + " is withdrawing " + amount);

            try {
                Thread.sleep(100); // simulate processing delay
            } catch (InterruptedException e) {}

            balance = balance - amount;

            System.out.println(name + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(name + " failed. Insufficient balance.");
        }
    }
}

class Person extends Thread
{
    BankAccount bankAccount;
    String name;

    Person(String name , BankAccount bankAccount)
    {
        this.name = name;
        this.bankAccount = bankAccount;
    }
    public void run()
    {
        bankAccount.withdraw(name , 1000);
    }
}

public class _02_Synchronised_Code
{
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        Person p1 = new Person("gaurav" , b);
        Person p2 = new Person("Umesh" , b);

        p1.start();
        p2.start();

        System.out.println("Started processing");
    }
}
