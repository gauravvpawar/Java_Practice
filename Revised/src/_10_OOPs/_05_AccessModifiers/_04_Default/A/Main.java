package _10_OOPs._05_AccessModifiers._04_Default.A;

public class Main
{
    public static void main(String[] args) {
        Human h = new Human();
        h.hello(); // default can accessible within the package only
    }
}
