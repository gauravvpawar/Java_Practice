package _02_Annotation;

class Father
{
    public void Property()
    {
        System.out.println("They Build a large property");
    }
}

class Son extends Father
{
    @Override // it provide metadata to compiler the parent class method is overriding
    public void Property()
    {
        System.out.println("Inherit parent property inside child");
    }
}


public class _01_Demo
{
    public static void main(String[] args) {
        /*
        Annotation add meta data to your code
        it add instruction to compiler
        it dont change program logic
         */

        Father f1 = new Father();
        f1.Property();

        Son s1 = new Son();
        s1.Property();
    }
}
