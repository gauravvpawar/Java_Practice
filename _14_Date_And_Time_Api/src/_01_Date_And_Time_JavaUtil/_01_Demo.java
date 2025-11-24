package _01_Date_And_Time_JavaUtil;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class _01_Demo
{
    public static void main(String[] args) {
        /*
        Date and time api
        That was introduced in java 8 JODA organisation
        - we can achieve through sql package as well as util package
         */

        Date d1 = new Date();
        System.out.println(d1.getDate());
        System.out.println(d1.getTime());

        LocalDate l1 = LocalDate.now();
        System.out.println(l1.atStartOfDay());
        System.out.println(l1.getYear());
        System.out.println(l1.getMonth());
        System.out.println(l1.getDayOfMonth());

        LocalTime lt1 = LocalTime.now();
        System.out.println(lt1.toString());
        System.out.println(lt1.getHour());
        System.out.println(lt1.getMinute());
        System.out.println(lt1.getSecond());
        while (true)
        {
            try
            {
                Thread.sleep(1000);
                System.out.println(lt1.getHour() + " : " + lt1.getMinute() + " : "+ lt1.getSecond()+ " : " );
            }catch (Exception e)
            {
                System.out.println("Something went wrong");
            }
        }
//        System.out.println(lt1.getNano());

    }
}
