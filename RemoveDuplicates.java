package StringJava;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "HelloWorld";
        System.out.println(Arrays.toString(s.toCharArray()));
        System.out.println(Arrays.toString(checkFrequency(s)));
        System.out.println(removeDuplicates(s));
    }
    public static String removeDuplicates(String s)
    {
        int [] frequency = checkFrequency(s);
        String ans = "";
        for (int i = 0; i < s.length(); i++) {

            if(frequency[i] == 0)
            {
                ans = ans+s.charAt(i);
            }
        }
        return ans;
    }
    public static int[] checkFrequency(String s)
    {
        int[] ct = new int[s.length()];

        for(int i = 0; i<s.length();i++)
        {
            if(ct[i]!=(-1))
            {
                int cnt = 0;
                for(int j = i+1;j<s.length();j++)
                {
                    if(s.charAt(i)==s.charAt(j))
                    {
                        cnt++;
                        ct[j] = -1;
                    }
                }
                ct[i] = cnt;

            }
        }
        return ct;
    }
}
