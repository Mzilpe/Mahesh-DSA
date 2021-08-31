package StringBasic;
import java.util.*;
public class StringsBasic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int low = 0;
        int high = s.length() - 1;
        int flag = 0;

        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                flag = 1;
                break;
            }

            low++;
            high--;
        }

        if (flag == 0)
            System.out.println("String is a palindrome");
        else
            System.out.println("String is not a palindrome");
    }
}
