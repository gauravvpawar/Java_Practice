package _10_OOPs._04_Abstraction;

// we 'll see how interface can solve
// in interface once create the variable that variable become public static and final
// you can not define this variable again

interface RBI
{
    int amount = 10000;

    void rules();
}

interface BOI
{
    int amount = 10000;

    void rules();
}

class ITWorker implements RBI , BOI{
    public void rules()
    {
//        System.out.println("amount we used : " + amount);    // it gives error
    }
}

public class _03_Interface_More
{
    public static void main(String[] args) {
    // that the ambiguity problem
    }
}
