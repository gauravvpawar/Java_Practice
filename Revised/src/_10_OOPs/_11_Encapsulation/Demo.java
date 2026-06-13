package _10_OOPs._11_Encapsulation;

// to wrapping of data in single unit and restrict the access of properties
class FaceBook
{
    private String username;
    private int password;

    public void setUsername(String username)
    {
        this.username = username;
    }

    public void setPassword(int password)
    {
        this.password = password;
    }

    // to get the value of private variables
    public String getUsername()
    {
        return username;
    }

    // to get the password
    public int getPassword()
    {
        return password;
    }

}

public class Demo
{
    public static void main(String[] args) {
        FaceBook f1 = new FaceBook();
        f1.setUsername("World");
        f1.setPassword(123456789);

        // to access the properties
        System.out.println(f1.getUsername());
        System.out.println(f1.getPassword());
    }
}
