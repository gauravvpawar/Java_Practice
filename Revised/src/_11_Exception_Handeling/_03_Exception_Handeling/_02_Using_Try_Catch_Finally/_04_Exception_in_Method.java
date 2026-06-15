package _11_Exception_Handeling._03_Exception_Handeling._02_Using_Try_Catch_Finally;

class Test
{
    static void Show()
    {
        int a = 15 , b = 0;
        System.out.println(a/b);
    }
}

public class _04_Exception_in_Method {
    public static void main(String[] args) {
        // when exception it have when you call another class method it have exception then it throws the exception for
        // calling point and exception occur in which line

        Test.Show();
        /*
     Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
        at _11_Exception_Handeling._02_UnChecked_Exception.Main.main(Main.java:12)
         */
    }
}
