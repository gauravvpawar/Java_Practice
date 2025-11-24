package _02_Annotation._Custom_Annotation;

import java.lang.annotation.*;

@Target({ElementType.TYPE , ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME) // it specify annotation is available
@interface CricketPlayer
{
    String Country() default "India";
}

@CricketPlayer
class Rohit
{
    @CricketPlayer
    private int inning;
    private int runs;

//    @CricketPlayer  you did not specify the element type method i.e it gives error
    public void setInning(int inning)
    {
        this.inning = inning;
    }

    public void setRuns(int runs)
    {
        this.runs = runs;
    }

    public int getInning()
    {
        return inning;
    }

    public int getRuns()
    {
        return runs;
    }
}

public class Demo
{
    public static void main(String[] args) {
        Rohit r1 = new Rohit();
        r1.setInning(2000);
        r1.setRuns(2000000);

        System.out.println(r1.getInning());
        System.out.println(r1.getRuns());

        Class c1 =  r1.getClass();
         Annotation a1 = c1.getAnnotation(CricketPlayer.class);
//        System.out.println(a1.annotationType());

        CricketPlayer c2 = (CricketPlayer) a1;
        System.out.println(c2.Country());

    }
}
