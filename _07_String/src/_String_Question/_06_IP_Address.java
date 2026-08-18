package _String_Question;

public class _06_IP_Address
{
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
        System.out.println(defangIpaddr(address));
    }

    public static String defangIPaddr(String address) {
        return address.replace("." ,"[.]");
    }

    public static String defangIpaddr(String address)
    {
        StringBuilder ans = new StringBuilder();

        for(int i = 0;i<address.length();i++)
        {
            if(address.charAt(i) == '.')
            {
                ans.append("[.]");
            }else{
                ans.append(address.charAt(i));
            }
        }

        return ans.toString();
    }
}
