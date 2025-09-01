package StringJava;

public class CountOfCharacters {
    public static void main(String[] args) {
        String s = "Helo_java_123_$_i_am_Devloper_$#.";

        System.out.println("Count Of Lower Case Characters : "+cntOfLowerCaseChars(s));
        System.out.println("Count Of Upper Case Characters : "+cntOfUpperCaseChars(s));
        System.out.println("Count Of Digits : "+cntOfDigits(s));
        System.out.println("Count Of Special Characters : "+cntOfSpecialChars(s));
    }
    public static int cntOfLowerCaseChars(String s)
    {
        int cnt = 0;
        for(int i = 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch>='a'&&ch<='z')
            {
                cnt++;
            }
        }
        return cnt;
    }
    public static int cntOfUpperCaseChars(String s)
    {
        int cnt = 0;
        for(int i = 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch>='A'&&ch<='Z')
            {
                cnt++;
            }
        }
        return cnt;
    }
    public static int cntOfDigits(String s)
    {
        int cnt = 0;
        for(int i = 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch>='0'&&ch<='9')
            {
                cnt++;
            }
        }
        return cnt;
    }
    public static int cntOfSpecialChars(String s)
    {
        int cnt = 0;
        for(int i = 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(!(ch>='a'&&ch<='z') && (!(ch>='A'&&ch<='Z')) && (!(ch>='0'&&ch<='9')))
            {
                cnt++;
            }
        }
        return cnt;
    }
}
