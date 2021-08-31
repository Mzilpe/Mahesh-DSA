package Combinations;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class NoOfSubsequence {
        static long mod = (long)1e9+7;
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();//abnxabbaab
            long count = 0, ans=1;
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i) == 'a'){
                    count++;
                }
                if(str.charAt(i)=='b'){
                    ans = (ans*(count+1)) % mod;
                    count = 0;
                }
            }
            ans = (ans*(count+1)) % mod;
            System.out.println((ans - 1 + mod) % mod);
        }
}

