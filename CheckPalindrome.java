package StringJava;

public class CheckPalindrome {
    public static void main(String[] args) {
        String s = "madam";
        if(checkpalindrome(s))
        {
            System.out.println(s+" Is Palindrome.");
        }
        else
        {
            System.out.println(s+" Is Not Palindrome.");
        }
    }
    public static boolean checkpalindrome(String s)
    {
        for (int i = 0,j=s.length()-1;i<=j; i++,j--) {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
        }
        return true;
    }
}
