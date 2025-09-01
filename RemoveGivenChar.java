package StringJava;

public class RemoveGivenChar {
    public static void main(String[] args) {

        String s = "Hello";
        String ans = "";
        char c = 'l';
        for(int i = 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(c!=ch)
            {
                ans = ans+ch;
            }
        }
        System.out.println(ans);
    }
}
