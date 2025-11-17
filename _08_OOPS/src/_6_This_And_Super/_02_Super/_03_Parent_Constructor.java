package _6_This_And_Super._02_Super;

class universe
{
    universe()
    {
        System.out.println("You are inside universe");
    }
}

class Earth extends universe
{
    Earth()
    {
        super();
        System.out.println("Inside the earth");
    }
}

public class _03_Parent_Constructor
{
    public static void main(String[] args) {
        Earth e1 = new Earth();

    }
}
