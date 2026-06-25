package _17_Date_And_Time_API;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _02_LocalDate_And_Time
{
    public static void main(String[] args) {
        /*
        In java 8 we have local date and time which is thread safe
         */
        // in three ways we can get date and time
        // by only localdate
        LocalDate ld = LocalDate.now();

        System.out.println(ld.getDayOfMonth());
        System.out.println(ld.getMonth());
        System.out.println(ld.getYear());

        // LocalTime
        LocalTime lt = LocalTime.now();
        System.out.println(lt.getHour());
        System.out.println(lt.getMinute());
        System.out.println(lt.getSecond());

        System.out.println(lt.getHour() + " : " + lt.getMinute()  + " : " + lt.getSecond());

        // and 3 rd one we have localdate and Time
        LocalDateTime ldt = LocalDateTime.now();
        // we get all of date and time methods
        System.out.println(ldt.getHour() + " : " + ldt.getMinute() +" : " +ldt.getSecond());

        // we have also date formatter
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String currentDateTime = ldt.format(dtf);
        System.out.println(currentDateTime);
    }
}
