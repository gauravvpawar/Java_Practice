package _04_Function;

public class _04_LoopScope
{
    public static void main(String[] args) {
        // Loop scope variable means you cant access that variable that you declare inside the loop
        for(int i = 1;i<=5;i++)
        {
            System.out.println(i);
        }

//        System.out.println(i);//you cant
    }
}
