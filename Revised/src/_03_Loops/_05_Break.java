package _03_Loops;

public class _05_Break
{
    public static void main(String[] args) {
        // break key word used when you have to exit from that loop  when that condition hit

        for (int i = 1;i<=10;i++)
        {
            if(i == 5)
            {
                break;
            }

            System.out.println(i);
        }

    }
}
