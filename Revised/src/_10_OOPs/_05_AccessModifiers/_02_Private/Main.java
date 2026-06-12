package _10_OOPs._05_AccessModifiers._02_Private;

public class Main
{
    public static void main(String[] args) {
        FaceBook f = new FaceBook();

        f.info(); // it can be accessible through while call method through another method
//        f.messageInfo();  // you can not accessible outside
    }
}
