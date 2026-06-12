package _10_OOPs._05_AccessModifiers._02_Private;

// private it can be accessible within class
// it cant accessible anywhere like whole package, outside package or child package

public class FaceBook
{
    private void messageInfo()
    {
        System.out.println("Chat is encrypted");
    }

    public void info()
    {
        messageInfo();
    }
}
