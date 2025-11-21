package _Task;

public class _01_Create_Time_Watch
{
    public static void main(String args[])
    {
        System.out.println("Clock Started ..");
        for (int hour = 00;hour<24;hour++)
        {
            if(hour > 0)
            {
                System.out.println("Hour " + hour + "completed");
            }

            for(int min = 0;min<60;min++)
            {
                for(int sec = 00;sec<60;sec++)
                {
                    try
                    {
                        Thread.sleep(1000);
                        System.out.println(hour + " : " + min + " : " + sec);
                    }catch (Exception e)
                    {
                        System.out.println("something went wrong");
                    }
                }
            }
        }
    }
}
