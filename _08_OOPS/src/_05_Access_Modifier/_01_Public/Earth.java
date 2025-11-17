package _05_Access_Modifier._01_Public;

// public class can accessible in everywhere inside of class , subclass, outside package or outside package subclass
public class Earth
{
    public static void main(String[] args) {
        Rain r1 = new Rain();
        r1.fun();
    }
}
