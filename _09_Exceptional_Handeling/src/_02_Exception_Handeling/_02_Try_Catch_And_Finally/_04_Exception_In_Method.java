package _02_Exception_Handeling._02_Try_Catch_And_Finally;

class Student
{
    void show()
    {
        int x = 10 , y = 0;
        System.out.println(x / y);
    }
}

public class _04_Exception_In_Method
{
    public static void main(String[] args) {
        /*
         when you call the object method  that have the  exception you have to handel where you have been calling or instead
         handle the exception occur code
         --  but when you called them it showed two line the called line and the risk line
         */

        Student s1 = new Student();
        try
        {
               s1.show();
        }catch (Exception e)
        {
            System.out.println("Risk block" + e.getMessage());
        }
    }
}
