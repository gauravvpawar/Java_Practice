package _03_Loops;

public class _06_Continue
{
    public static void main(String[] args) {
        // continue keyword used for when you have to skip that iteration when that condition hit

        for(int i = 1;i<=10;i++)
        {

            if(i == 5)
            {
                continue;
            }

            System.out.println(i);
        }

        System.out.println("done");
    }
}
