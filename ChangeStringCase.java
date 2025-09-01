package StringJava;

public class ChangeStringCase {
    public static void main(String[] args) {
        String s = "hello world";
        System.out.println(toUpperCase(s));
        String s1 = "HELLO JAVA";
        System.out.println(toLowerCase(s1));
    }
    public static String toUpperCase(String s)
    {
        String ans = "";
        for(int i = 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch>='a'&&ch<='z' && (ch != ' '))
            {
                ans = ans + (char) (ch - 32);
            }
            else
            {
                ans = ans + ch;
            }
        }
        return ans;
    }
    public static String toLowerCase(String s)
    {
        String ans = "";
        for(int i = 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch>='A'&&ch<='Z' && (ch != ' '))
            {
                ans = ans + (char) (ch + 32);
            }
            else
            {
                ans = ans + ch;
            }
        }
        return ans;
    }
}
