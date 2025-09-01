package StringJava;
import java.util.Arrays;
public class StringToCharArray {
    public static void main(String[] args) {
        String s = "Hello World";
        char [] a = new char[s.length()];

        for (int i = 0; i <s.length(); i++) {
            a[i]=s.charAt(i);
        }
        System.out.println(Arrays.toString(a));
    }
}
