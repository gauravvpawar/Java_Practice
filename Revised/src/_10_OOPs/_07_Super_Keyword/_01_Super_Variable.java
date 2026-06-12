package _10_OOPs._07_Super_Keyword;

class College
{
    String principle = "xyz";

    void work()
    {
        System.out.println("To handle all work of college");
    }
}

class School extends College
{
    String principle = "abc";
    void work()
    {
        super.work(); // it called first college method
        System.out.println(super.principle + " will handle the college work " + principle + "handle the school work");
    }
}

public class _01_Super_Variable
{
    public static void main(String[] args) {
        School s = new School();
        s.work();
    }
}
