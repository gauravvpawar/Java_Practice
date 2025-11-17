package _05_Access_Modifier._04_Default;

/*
    when did not provide any access modifier to the class it treated as the default access modier
    // it can accessible within the class outside class but you cant access outside the package
 */

class Rain
{
    void rain()
    {
        System.out.println("rain started");
    }

    void execute()
    {
        Rain r1 = new Rain();
        r1.rain();
    }
}

public class Earth extends Rain
{
    public static void main(String[] args) {
        Earth e1 = new Earth();
        e1.execute();
    }
}
