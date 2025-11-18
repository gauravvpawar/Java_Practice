package _10_Encapsulation;

import javax.swing.*;

class Bank
{
    private String username;
    private int password;

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getUsername()
    {
        return username;
    }

    public void setPassword(int password)
    {
        this.password = password;
    }

    public int getPassword()
    {
        return password;
    }
}

public class Demo
{
    public static void main(String[] args) {
        /*
        in encapsulation all the  variable must be private and while the getting that data must be through methods
        it is combining of data in one single unit
         */

        Bank b1 = new Bank();
//        b1.username = "hello"; you cant access the data in that way
        b1.setUsername("Gaurav");
        b1.setPassword(1234);

        System.out.println(b1.getUsername());
        System.out.println(b1.getPassword());
    }
}
