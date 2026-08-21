package _04_Optional_Class;

import java.util.Optional;

public class _01_Main
{
    public static void main(String[] args) {
        // optional class introduce in java 1.8
        // for the exception of nullPointerException
        // it maily used for to avoid the exception null pointer exception
//        String name = "Gaurav";
        String name = null;

        String option = Optional.ofNullable(name).orElse("guest");

        // for the safaty to avoid null pointer exception we can add check
        System.out.println(option);
    }
}
