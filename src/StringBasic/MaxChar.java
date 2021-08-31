package StringBasic;
import java.util.*;
public class MaxChar {



        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();

            int max = 0;
            char result = 'a';
            int[] count = new int[26];

            // Traversing through the string and maintaining the count of each character
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i)  - 'a']++;
            }

            for(int i = 0; i < 26 ; i++){
                if(count[i] > max){
                    max = count[i];
                    result = (char)('a' + i);
                }
            }

            System.out.println(result);
        }


}
